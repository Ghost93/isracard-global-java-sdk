package com.paymeservice.android.model;

/**
 * Created by loiho on 5/10/16.
 */
public class GenerateSaleRequest {
    public static abstract class Entry {
        public static final String SELLER_PAYME_ID = "seller_payme_id";
        public static final String SALE_PRICE = "sale_price";
        public static final String CURRENCY = "currency";
        public static final String PRODUCT_NAME = "product_name";
        public static final String TRANSACTION_ID = "transaction_id";
        public static final String INSTALLMENTS = "installments";
        public static final String LAYOUT = "layout";
        public static final String SALE_CALLBACK_URL = "sale_callback_url";
        public static final String SALE_RETURN_URL = "sale_return_url";
        public static final String SALE_ERROR_URL = "sale_error_url";
        public static final String SALE_CANCEL_URL = "sale_cancel_url";
        public static final String CAPTURE_BUYER = "capture_buyer";
    }

    public String sellerPaymeId;
    public Double salePrice;
    public String currency;
    public String productName;
    public String transactionId;
    public Integer installments;
    public String layout;
    public String saleCallbackUrl;
    public String saleReturnUrl;
    public String saleErrorUrl;
    public String saleCancelUrl;
    public Integer captureBuyer;

    public String getSellerPaymeId() {
        return sellerPaymeId;
    }

    public void setSellerPaymeId(String sellerPaymeId) {
        this.sellerPaymeId = sellerPaymeId;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getSaleCallbackUrl() {
        return saleCallbackUrl;
    }

    public void setSaleCallbackUrl(String saleCallbackUrl) {
        this.saleCallbackUrl = saleCallbackUrl;
    }

    public String getSaleReturnUrl() {
        return saleReturnUrl;
    }

    public void setSaleReturnUrl(String saleReturnUrl) {
        this.saleReturnUrl = saleReturnUrl;
    }

    public String getSaleErrorUrl() {
        return saleErrorUrl;
    }

    public void setSaleErrorUrl(String saleErrorUrl) {
        this.saleErrorUrl = saleErrorUrl;
    }

    public String getSaleCancelUrl() {
        return saleCancelUrl;
    }

    public void setSaleCancelUrl(String saleCancelUrl) {
        this.saleCancelUrl = saleCancelUrl;
    }

    public Integer getCaptureBuyer() {
        return captureBuyer;
    }

    public void setCaptureBuyer(Integer captureBuyer) {
        this.captureBuyer = captureBuyer;
    }
}
