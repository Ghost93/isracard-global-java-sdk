package com.paymeservice.android.model;

/**
 * Created by LoiHo on 5/17/16.
 */
public class PaySubscriptionRequest {

  public static abstract class Entry {
    public static final String SUB_PAYME_ID = "sub_payme_id";
    public static final String CREDIT_CARD_NUMBER = "credit_card_number";
    public static final String CREDIT_CARD_EXP = "credit_card_exp";
    public static final String CREDIT_CARD_CVV = "credit_card_cvv";
    public static final String BUYER_NAME = "buyer_name";
    public static final String BUYER_SOCIAL_ID = "buyer_social_id";
    public static final String BUYER_PHONE = "buyer_phone";
    public static final String BUYER_EMAIL = "buyer_email";
  }

  public String subPaymeId;
  public String creditCardNumber;
  public String creditCardExp;
  public String creditCardCvv;
  public String buyerName;
  public String buyerSocialId;
  public String buyerPhone;
  public String buyerEmail;

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

  public String getCreditCardCvv() {
    return creditCardCvv;
  }

  public void setCreditCardCvv(String creditCardCvv) {
    this.creditCardCvv = creditCardCvv;
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
