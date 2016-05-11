package com.paymeservice.android.model;

/**
 * Created by loiho on 5/10/16.
 */
public class PaySaleRequest {

    public static abstract class Entry {
        public static final String PAYME_SALE_ID = "payme_sale_id";
        public static final String CREDIT_CARD_NUMBER = "credit_card_number";
        public static final String CREDIT_CARD_CVV = "credit_card_cvv";
        public static final String CREDIT_CARD_EXP = "credit_card_exp";
        public static final String BUYER_SOCIAL_ID = "buyer_social_id";
        public static final String BUYER_EMAIL = "buyer_email";
        public static final String BUYER_NAME = "buyer_name";
    }

    private String paymeSaleId;
    private String creditCardNumber;
    private String creditCardCVV;
    private String creditCardExp;
    private String buyerSocialID;
    private String buyerEmail;
    private String buyerName;

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
}
