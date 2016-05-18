package com.paymeservice.android;

import com.paymeservice.android.error.PayMeError;
import com.paymeservice.android.model.PaySaleRequest;
import com.paymeservice.android.model.PaySaleResponse;
import com.paymeservice.android.model.PaySubscriptionRequest;
import com.paymeservice.android.model.PaySubscriptionResponse;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by loiho on 5/10/16.
 * <p>
 * The data mapping class
 */
abstract class DataMapper {
  private static final String EMPTY_STRING = "";

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

  public static JSONObject toJson(PaySubscriptionRequest data) {
    JSONObject json = new JSONObject();

    try {
      json.put(PaySubscriptionRequest.Entry.SUB_PAYME_ID, data.getSubPaymeId());
      json.put(PaySubscriptionRequest.Entry.CREDIT_CARD_NUMBER, data.getCreditCardNumber());
      json.put(PaySubscriptionRequest.Entry.CREDIT_CARD_EXP, data.getCreditCardExp());
      json.put(PaySubscriptionRequest.Entry.CREDIT_CARD_CVV, data.getCreditCardCvv());
      json.put(PaySubscriptionRequest.Entry.BUYER_NAME, data.getBuyerName());
      json.put(PaySubscriptionRequest.Entry.BUYER_SOCIAL_ID, data.getBuyerSocialId());
      json.put(PaySubscriptionRequest.Entry.BUYER_PHONE, data.getBuyerPhone());
      json.put(PaySubscriptionRequest.Entry.BUYER_EMAIL, data.getBuyerEmail());
    } catch (JSONException e) {
      e.printStackTrace();
    }

    return json;
  }

  public static PaySubscriptionResponse paySubscriptionFromJson(JSONObject json) {
    PaySubscriptionResponse response = new PaySubscriptionResponse();
    return response;
  }

  public static PayMeError payMeErrorFromJson(JSONObject json) {
    PayMeError payMeError = new PayMeError();
    try {
      payMeError.setStatusCode(getInt(json, PayMeError.Entry.STATUS_CODE));
      payMeError.setStatusErrorDetails(getString(json, PayMeError.Entry.STATUS_ERROR_DETAILS));
      payMeError.setStatusAdditionalInfo(getString(json, PayMeError.Entry.STATUS_ADDITIONAL_INFO));
      payMeError.setStatusErrorCode(getInt(json, PayMeError.Entry.STATUS_ERROR_CODE));
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return payMeError;
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
