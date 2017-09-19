package com.paymeservice.android.model;

import android.support.annotation.Keep;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

/**
 * Created by grang on 14/09/2017.
 */

@Keep
public class SaleFeesItem {
    public static SaleFeesItem fromJson(Moshi moshi, String json) throws IOException {
        JsonAdapter<SaleFeesItem> adapter = moshi.adapter(SaleFeesItem.class);
        return adapter.fromJson(json);
    }
    @Json(name = "sale_processing_fee") private Double saleProcessingFee;
    @Json(name = "sale_processing_charge") private Double saleProcessingCharge;
    @Json(name = "sale_discount_fee") private Double saleDiscountFee;
    @Json(name = "sale_market_fee") private Double saleMarketFee;

    public Double getSaleProcessingFee() {
        return saleProcessingFee;
    }

    public Double getSaleProcessingCharge() {
        return saleProcessingCharge;
    }

    public Double getSaleDiscountFee() {
        return saleDiscountFee;
    }

    public Double getSaleMarketFee() {
        return saleMarketFee;
    }
}
