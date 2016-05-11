package com.paymeservice.android;

import com.paymeservice.android.model.GenerateSaleRequest;
import com.paymeservice.android.model.GenerateSaleResponse;
import com.paymeservice.android.model.PaySaleRequest;
import com.paymeservice.android.model.PaySaleResponse;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by loiho on 5/10/16.
 * <p>
 * The data mapping class
 */
abstract class DataMapper {
    private static final String EMPTY_STRING = "";

    public static JSONObject toJson(GenerateSaleRequest data) {
        JSONObject json = new JSONObject();

        try {
            json.put(GenerateSaleRequest.Entry.SELLER_PAYME_ID, data.getSellerPaymeId());
            json.put(GenerateSaleRequest.Entry.SALE_PRICE, data.getSalePrice());
            json.put(GenerateSaleRequest.Entry.CURRENCY, data.getCurrency());
            json.put(GenerateSaleRequest.Entry.PRODUCT_NAME, data.getProductName());
            json.put(GenerateSaleRequest.Entry.TRANSACTION_ID, data.getTransactionId());
            json.put(GenerateSaleRequest.Entry.INSTALLMENTS, data.getInstallments());
            json.put(GenerateSaleRequest.Entry.LAYOUT, data.getLayout());
            json.put(GenerateSaleRequest.Entry.SALE_CALLBACK_URL, data.getSaleCallbackUrl());
            json.put(GenerateSaleRequest.Entry.SALE_RETURN_URL, data.getSaleReturnUrl());
            json.put(GenerateSaleRequest.Entry.SALE_ERROR_URL, data.getSaleErrorUrl());
            json.put(GenerateSaleRequest.Entry.SALE_CANCEL_URL, data.getSaleCancelUrl());
            json.put(GenerateSaleRequest.Entry.CAPTURE_BUYER, data.getCaptureBuyer());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static GenerateSaleResponse fromJson(JSONObject json) throws JSONException {
        GenerateSaleResponse response = new GenerateSaleResponse();
        response.setStatusCode(getInt(json, GenerateSaleResponse.Entry.STATUS_CODE));
        response.setSaleUrl(getString(json, GenerateSaleResponse.Entry.SALE_URL));
        response.setPaymeSaleId(getString(json, GenerateSaleResponse.Entry.PAYME_SALE_ID));
        response.setPaymeSaleCode(getInt(json, GenerateSaleResponse.Entry.PAYME_SALE_CODE));
        response.setPrice(getDouble(json, GenerateSaleResponse.Entry.PRICE));
        response.setTransactionId(getString(json, GenerateSaleResponse.Entry.TRANSACTION_ID));
        response.setCurrency(getString(json, GenerateSaleResponse.Entry.CURRENCY));
        return response;
    }

    public static JSONObject toJson(PaySaleRequest data) {
        JSONObject json = new JSONObject();

        try {
            json.put(PaySaleRequest.Entry.PAYME_SALE_ID, data.getPaymeSaleId());
            json.put(PaySaleRequest.Entry.CREDIT_CARD_NUMBER, data.getCreditCardNumber());
            json.put(PaySaleRequest.Entry.CREDIT_CARD_CVV, data.getCreditCardCVV());
            json.put(PaySaleRequest.Entry.CREDIT_CARD_EXP, data.getCreditCardExp());
            json.put(PaySaleRequest.Entry.BUYER_SOCIAL_ID, data.getBuyerSocialID());
            json.put(PaySaleRequest.Entry.BUYER_EMAIL, data.getBuyerEmail());
            json.put(PaySaleRequest.Entry.BUYER_NAME, data.getBuyerName());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static PaySaleResponse paySaleFromJson(JSONObject json) {
        PaySaleResponse paySaleResponse = new PaySaleResponse();
        return paySaleResponse;
    }

    public static String getString(JSONObject json, String key) throws JSONException {
        if (json != null && json.has(key)) {
            return json.getString(key);
        }
        return EMPTY_STRING;
    }

    public static boolean getBoolean(JSONObject json, String key) throws JSONException {
        return json != null && json.has(key) && json.getBoolean(key);
    }

    public static int getInt(JSONObject json, String key) throws JSONException {
        if (json != null && json.has(key)) {
            return json.getInt(key);
        }
        return 0;
    }

    public static Double getDouble(JSONObject json, String key) throws JSONException {
        if (json != null && json.has(key)) {
            return json.getDouble(key);
        }
        return null;
    }
}
