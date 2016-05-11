package com.paymeservice.android;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Patterns;

import com.paymeservice.android.error.PayMeException;
import com.paymeservice.android.model.PaySaleRequest;
import com.paymeservice.android.model.PaySaleResponse;
import com.paymeservice.android.model.Settings;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Calendar;
import java.util.regex.Pattern;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by loiho on 5/9/16.
 * <p>
 * The PayMe's API for Android.
 */
public class PayMe {
    private static final String TAG = PayMe.class.getSimpleName();
    private static PayMe INSTANCE = null;

    private static final String PATH_GENERATE_SALE = "/generate-sale";
    private static final String PATH_PAY_SALE = "/pay-sale";

    private Settings settings;
    private OkHttpClient client;
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    PayMe(Settings settings) {
        this.settings = settings;

        if (settings.getEnvironment() != Settings.Environment.PRODUCTION) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();
        } else {
            client = new OkHttpClient();
        }
    }

    /**
     * Get the server URL (STAGING or PRODUCTION).
     *
     * @return the server URL
     */
    String getServerURL() {
        switch (settings.getEnvironment()) {
            case PRODUCTION:
                return Settings.PRODUCTION_ADDRESS;
            default:
                return Settings.STAGING_ADDRESS;
        }
    }

    /**
     * Create request body for each api.
     *
     * @param path    the endpoint of the api.
     * @param content the json body.
     * @return
     */
    Request createRequest(String path, String content) {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"), content);
        Request request = new Request.Builder()
                .url(INSTANCE.getServerURL() + PATH_GENERATE_SALE)
                .post(requestBody)
                .build();
        return request;
    }

    /**
     * Create new instance with the settings
     *
     * @param settings the settings of PayMe's API
     */
    public static PayMe initialize(Settings settings) {
        if (INSTANCE == null) {
            synchronized (PayMe.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PayMe(settings);
                }
            }
        }
        return INSTANCE;
    }

    /**
     * Used to force current instance to create a new instance
     * next time it's called.
     */
    public static void destroyInstance() {
        INSTANCE = null;
    }

    /**
     * Pay sale
     *
     * @param request  the json body.
     * @param listener call back.
     */
    public static void paySale(PaySaleRequest request, final TransactionListener<PaySaleResponse> listener) {

        String content = DataMapper.toJson(request).toString();
        Request httpRequest = INSTANCE.createRequest(PATH_PAY_SALE, content);
        INSTANCE.client.newCall(httpRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                INSTANCE.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null) {
                            listener.onFailed(e);
                        }
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                INSTANCE.mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (listener != null) {
                            if (response.isSuccessful()) {
                                try {
                                    String responseData = response.body().string();
                                    Log.d(TAG, responseData);

                                    JSONObject json = new JSONObject(responseData);
                                    PaySaleResponse saleResponse = DataMapper.paySaleFromJson(json);

                                    if (saleResponse.getStatusCode() == 0) {
                                        listener.onSuccess(saleResponse);
                                    } else {
                                        listener.onFailed(new PayMeException());
                                    }

                                } catch (JSONException e) {
                                    listener.onFailed(new JSONException("The json format incorrect."));
                                } catch (IOException e) {
                                    listener.onFailed(new IOException());
                                }
                            } else {
                                listener.onFailed(new Exception(response.message()));
                            }
                        }
                    }
                });
            }
        });
    }

    public interface TransactionListener<T> {
        void onSuccess(T response);

        void onFailed(Exception exception);
    }

    /**
     * This class using to validate the user's data.
     */
    public static class Validator {
        private static final String CVC = "/^[0-9]{3,4}$/";
        private static final String CARD_NUMBER = "/^[0-9]{8,16}$/";
        public static final int R_ELEGAL_INPUT = -1;
        public static final int R_NOT_VALID = -2;
        public static final int R_VALID = 1;

        public static boolean isPhone(String phone) {
            return Patterns.PHONE.matcher(phone).matches();
        }

        public static boolean isEmail(String email) {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }

        public static boolean isCVC(String cvc) {
            return Pattern.matches(CVC, cvc);
        }

        public static boolean isCardNumber(String cardNumber) {
            return Pattern.matches(CARD_NUMBER, cardNumber);
        }

        public static boolean validateExpMonth(int month) {
            return (month >= 1 && month <= 12);
        }

        public static boolean validateExpYear(int year) {
            Calendar calendar = Calendar.getInstance();
            int currentYear = calendar.get(Calendar.YEAR);
            return year >= currentYear;
        }

        public static int validateSocialID(String socialID) {
            if (socialID == null) {
                return R_ELEGAL_INPUT;
            }

            int length = socialID.length();
            if (length > 9 || length < 5) {
                return R_ELEGAL_INPUT;
            }

            if (length < 9) {
                while (socialID.length() < 9) {
                    socialID += "0";
                }
            }

            int mone = 0, incNum;
            for (int i = 0; i < socialID.length(); i++) {
                incNum = (int) socialID.charAt(i);
                incNum *= i % 2 + 1;

                if (incNum > 9) {
                    incNum -= 9;
                    mone += incNum;
                }
            }
            if (mone != 0 && mone % 10 == 0) {
                return R_VALID;

            } else {
                return R_NOT_VALID;
            }
        }
    }
}
