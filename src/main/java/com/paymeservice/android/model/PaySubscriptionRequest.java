package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by LoiHo on 5/17/16.
 */
public class PaySubscriptionRequest {

  public String toJson(Moshi moshi) {
    JsonAdapter<PaySubscriptionRequest> adapter = moshi.adapter(PaySubscriptionRequest.class);
    return adapter.toJson(this);
  }

  @Json(name = "sub_payme_id") String subPaymeId;
  @Json(name = "credit_card_number") public String creditCardNumber;
  @Json(name = "credit_card_exp") public String creditCardExp;
  @Json(name = "credit_card_cvv") public String creditCardCVV;
  @Json(name = "buyer_name") public String buyerName;
  @Json(name = "buyer_social_id") public String buyerSocialId;
  @Json(name = "buyer_phone") public String buyerPhone;
  @Json(name = "buyer_email") public String buyerEmail;

  public String getSubPaymeId() {
    return subPaymeId;
  }

  public void setSubPaymeId(String subPaymeId) {
    this.subPaymeId = subPaymeId;
  }

  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public String getCreditCardExp() {
    return creditCardExp;
  }

  public void setCreditCardExp(String creditCardExp) {
    this.creditCardExp = creditCardExp;
  }

  public String getCreditCardCVV() {
    return creditCardCVV;
  }

  public void setCreditCardCvv(String creditCardCvv) {
    this.creditCardCVV = creditCardCvv;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getBuyerSocialId() {
    return buyerSocialId;
  }

  public void setBuyerSocialId(String buyerSocialId) {
    this.buyerSocialId = buyerSocialId;
  }

  public String getBuyerPhone() {
    return buyerPhone;
  }

  public void setBuyerPhone(String buyerPhone) {
    this.buyerPhone = buyerPhone;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }
}
