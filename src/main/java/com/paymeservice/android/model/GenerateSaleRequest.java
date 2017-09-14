package com.paymeservice.android.model;

import android.util.Log;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by grang on 13/09/2017.
 */

public class GenerateSaleRequest {
    public String toJson(Moshi moshi) {
        JsonAdapter<GenerateSaleRequest> adapter = moshi.adapter(GenerateSaleRequest.class);
        return adapter.toJson(this);
    }

    @Json(name = "seller_payme_id") private String sellerPaymeId;
    @Json(name = "sale_price") private Long salePrice;
    @Json(name = "currency") private String saleCurrency;
    @Json(name = "product_name") private String saleProductName;
    @Json(name = "transaction_id") private String saleTransactionId;
    @Json(name = "installments") private Integer saleInstallments;
    @Json(name = "capture_buyer") private Boolean captureBuyer;

    public String getSellerPaymeId() {
        return sellerPaymeId;
    }

    public void setSellerPaymeId(String sellerPaymeId) {
        this.sellerPaymeId = sellerPaymeId;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleCurrency() {
        return saleCurrency;
    }

    public void setSaleCurrency(String saleCurrency) {
        this.saleCurrency = saleCurrency;
    }

    public String getSaleProductName() {
        return saleProductName;
    }

    public void setSaleProductName(String saleProductName) {
        this.saleProductName = saleProductName;
    }

    public String getSaleTransactionId() {
        return saleTransactionId;
    }

    public void setSaleTransactionId(String saleTransactionId) {
        this.saleTransactionId = saleTransactionId;
    }

    public Integer getSaleInstallments() {
        return saleInstallments;
    }

    public void setSaleInstallments(Integer saleInstallments) {
        this.saleInstallments = saleInstallments;
    }

    public Boolean getCaptureBuyer() {
        return captureBuyer;
    }

    public void setCaptureBuyer(Boolean captureBuyer) {
        this.captureBuyer = captureBuyer;
    }
}