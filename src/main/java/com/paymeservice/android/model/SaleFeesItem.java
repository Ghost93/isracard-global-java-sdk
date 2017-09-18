package com.paymeservice.android.model;

import com.squareup.moshi.Json;

/**
 * Created by grang on 14/09/2017.
 */

class SaleFeesItem {
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
