package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/** Created by LoiHo on 6/27/16. */
public class CaptureBuyerResponse {
  public static CaptureBuyerResponse fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<CaptureBuyerResponse> adapter = moshi.adapter(CaptureBuyerResponse.class);
    return adapter.fromJson(json);
  }

  @Json(name = "status_code")
  private Integer statusCode;

  @Json(name = "buyer_key")
  private String buyerKey;

  @Json(name = "buyer_name")
  private String buyerName;

  @Json(name = "buyer_email")
  private String buyerEmail;

  @Json(name = "buyer_phone")
  private String buyerPhone;

  @Json(name = "buyer_card_mask")
  private String buyerCardMask;

  @Json(name = "buyer_card_exp")
  private String buyerCardExp;

  @Json(name = "buyer_social_id")
  private String buyerSocialId;

  public Integer getStatusCode() {
    return statusCode;
  }

  public String getBuyerKey() {
    return buyerKey;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }

  public String getBuyerPhone() {
    return buyerPhone;
  }

  public String getBuyerCardMask() {
    return buyerCardMask;
  }

  public String getBuyerCardExp() {
    return buyerCardExp;
  }

  public String getBuyerSocialId() {
    return buyerSocialId;
  }
}
