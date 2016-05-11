package com.paymeservice.android.model;

/**
 * Created by loiho on 5/10/16.
 */
public class PaySaleResponse {
    private Integer statusCode;
    private String paymeStatus;
    private Integer statusErrorCode;
    private String paymeSaleId;
    private Integer paymeSaleCode;
    private String saleCreated;
    private String paymeSaleStatus;
    private String saleStatus;
    private String currency;
    private String transactionId;
    private Boolean isTokenSale;
    private Integer price;
    private String paymeSignature;
    private String paymeTransactionId;
    private String paymeTransactionTotal;
    private String paymeTransactionCardBrand;
    private String paymeTransactionAuthNumber;
    private String buyerName;
    private String buyerEmail;
    private String buyerPhone;
    private String buyerCardMask;
    private String buyerCardExp;
    private String buyerSocialId;
    private Integer installments;
    private String salePaidDate;
    private String saleReleaseDate;

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getPaymeStatus() {
        return paymeStatus;
    }

    public Integer getStatusErrorCode() {
        return statusErrorCode;
    }

    public String getPaymeSaleId() {
        return paymeSaleId;
    }

    public Integer getPaymeSaleCode() {
        return paymeSaleCode;
    }

    public String getSaleCreated() {
        return saleCreated;
    }

    public String getPaymeSaleStatus() {
        return paymeSaleStatus;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Boolean getTokenSale() {
        return isTokenSale;
    }

    public Integer getPrice() {
        return price;
    }

    public String getPaymeSignature() {
        return paymeSignature;
    }

    public String getPaymeTransactionId() {
        return paymeTransactionId;
    }

    public String getPaymeTransactionTotal() {
        return paymeTransactionTotal;
    }

    public String getPaymeTransactionCardBrand() {
        return paymeTransactionCardBrand;
    }

    public String getPaymeTransactionAuthNumber() {
        return paymeTransactionAuthNumber;
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

    public Integer getInstallments() {
        return installments;
    }

    public String getSalePaidDate() {
        return salePaidDate;
    }

    public String getSaleReleaseDate() {
        return saleReleaseDate;
    }
}
