package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by LoiHo on 6/27/16.
 */
public class CaptureBuyerRequest {
  public String toJson(Moshi moshi) {
    JsonAdapter<CaptureBuyerRequest> adapter = moshi.adapter(CaptureBuyerRequest.class);
    return adapter.toJson(this);
  }

  @Json(name = "seller_payme_id") private String sellerPaymeId;
  @Json(name = "credit_card_number") private String creditCardNumber;
  @Json(name = "credit_card_exp") private String creditCardExp;
  @Json(name = "credit_card_cvv") private String creditCardCvv;
  @Json(name = "buyer_name") private String buyerName;
  @Json(name = "buyer_social_id") private String buyerSocialId;
  @Json(name = "buyer_email") private String buyerEmail;
  @Json(name = "buyer_phone") private String buyerPhone;
  @Json(name = "payme_client_key") private String paymeClientKey;

  public String getSellerPaymeId() {
    return sellerPaymeId;
  }

  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public String getCreditCardExp() {
    return creditCardExp;
  }

  public String getCreditCardCvv() {
    return creditCardCvv;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public String getBuyerSocialId() {
    return buyerSocialId;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }

  public String getBuyerPhone() {
    return buyerPhone;
  }

  public String getPaymeClientKey() {
    return paymeClientKey;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public void setCreditCardExp(String creditCardExp) {
    this.creditCardExp = creditCardExp;
  }

  public void setCreditCardCvv(String creditCardCvv) {
    this.creditCardCvv = creditCardCvv;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public void setBuyerSocialId(String buyerSocialId) {
    this.buyerSocialId = buyerSocialId;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  public void setBuyerPhone(String buyerPhone) {
    this.buyerPhone = buyerPhone;
  }

  public void setPaymeClientKey(String paymeClientKey) {
    this.paymeClientKey = paymeClientKey;
  }

  public void setSellerPaymeId(String sellerPaymeId) {
    this.sellerPaymeId = sellerPaymeId;

  }
}
