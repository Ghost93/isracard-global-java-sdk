package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by loiho on 5/10/16.
 */
public class PaySaleRequest {

  public String toJson(Moshi moshi) {
    JsonAdapter<PaySaleRequest> adapter = moshi.adapter(PaySaleRequest.class);
    return adapter.toJson(this);
  }

  @Json(name = "payme_sale_id") String paymeSaleId;
  @Json(name = "credit_card_number") String creditCardNumber;
  @Json(name = "credit_card_cvv") String creditCardCVV;
  @Json(name = "credit_card_exp") String creditCardExp;
  @Json(name = "buyer_social_id") String buyerSocialID;
  @Json(name = "buyer_email") String buyerEmail;
  @Json(name = "buyer_name") String buyerName;
  @Json(name = "installments") String installments;

  public String getPaymeSaleId() {
    return paymeSaleId;
  }

  public void setPaymeSaleId(String paymeSaleId) {
    this.paymeSaleId = paymeSaleId;
  }

  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public String getCreditCardCVV() {
    return creditCardCVV;
  }

  public void setCreditCardCVV(String creditCardCVV) {
    this.creditCardCVV = creditCardCVV;
  }

  public String getCreditCardExp() {
    return creditCardExp;
  }

  public void setCreditCardExp(String creditCardExp) {
    this.creditCardExp = creditCardExp;
  }

  public String getBuyerSocialID() {
    return buyerSocialID;
  }

  public void setBuyerSocialID(String buyerSocialID) {
    this.buyerSocialID = buyerSocialID;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getInstallments() {
    return installments;
  }

  public void setInstallments(String installments) {
    this.installments = installments;
  }
}
