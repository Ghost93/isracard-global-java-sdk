package com.paymeservice.android.model;

import android.util.Log;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

/**
 * Created by grang on 13/09/2017.
 */

public class GenerateSaleResponse {
    public static GenerateSaleResponse fromJson(Moshi moshi, String json) throws IOException {
        JsonAdapter<GenerateSaleResponse> adapter = moshi.adapter(GenerateSaleResponse.class);
        return adapter.fromJson(json);
    }
    @Json(name = "status_code") private Integer statusCode;
    @Json(name = "sale_url") private String saleUrl;
    @Json(name = "payme_sale_id") private String paymeSaleId;
    @Json(name = "payme_sale_code") private Long paymeSaleCode;
    @Json(name = "price") private Long salePrice;
    @Json(name = "transaction_id") private String saleTransactionId;
    @Json(name = "currency") private String saleCurrency;

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getSaleUrl() {
        return saleUrl;
    }

    public String getPaymeSaleId() {
        return paymeSaleId;
    }

    public Long getPaymeSaleCode() {
        return paymeSaleCode;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public String getSaleTransactionId() {
        return saleTransactionId;
    }

    public String getSaleCurrency() {
        return saleCurrency;
    }
}
