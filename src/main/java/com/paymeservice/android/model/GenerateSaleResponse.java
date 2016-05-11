package com.paymeservice.android.model;

/**
 * Created by loiho on 5/10/16.
 */
public class GenerateSaleResponse {
    public static abstract class Entry {
        public static final String STATUS_CODE = "status_code";
        public static final String SALE_URL = "sale_url";
        public static final String PAYME_SALE_ID = "payme_sale_id";
        public static final String PAYME_SALE_CODE = "payme_sale_code";
        public static final String PRICE = "price";
        public static final String TRANSACTION_ID = "transaction_id";
        public static final String CURRENCY = "currency";
    }

    private Integer statusCode;
    private String saleUrl;
    private String paymeSaleId;
    private Integer paymeSaleCode;
    private Double price;
    private String transactionId;
    private String currency;

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setSaleUrl(String saleUrl) {
        this.saleUrl = saleUrl;
    }

    public void setPaymeSaleId(String paymeSaleId) {
        this.paymeSaleId = paymeSaleId;
    }

    public void setPaymeSaleCode(Integer paymeSaleCode) {
        this.paymeSaleCode = paymeSaleCode;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getSaleUrl() {
        return saleUrl;
    }

    public String getPaymeSaleId() {
        return paymeSaleId;
    }

    public Integer getPaymeSaleCode() {
        return paymeSaleCode;
    }

    public Double getPrice() {
        return price;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCurrency() {
        return currency;
    }
}
