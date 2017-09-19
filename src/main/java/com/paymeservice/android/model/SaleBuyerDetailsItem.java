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
public class SaleBuyerDetailsItem {
    public static SaleBuyerDetailsItem fromJson(Moshi moshi, String json) throws IOException {
        JsonAdapter<SaleBuyerDetailsItem> adapter = moshi.adapter(SaleBuyerDetailsItem.class);
        return adapter.fromJson(json);
    }
    @Json(name = "buyer_card_mask") private String buyerCardMask;
    @Json(name = "buyer_card_brand") private String buyerCardBrand;
    @Json(name = "buyer_card_is_foreign") private Boolean buyerCardIsForeign;
    @Json(name = "buyer_name") private String buyerName;
    @Json(name = "buyer_email") private String buyerEmail;
    @Json(name = "buyer_phone") private String buyerPhone;
    @Json(name = "buyer_social_id") private String buyerSocialId;

    public String getBuyerCardMask() {
        return buyerCardMask;
    }

    public String getBuyerCardBrand() {
        return buyerCardBrand;
    }

    public Boolean getBuyerCardIsForeign() {
        return buyerCardIsForeign;
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

    public String getBuyerSocialId() {
        return buyerSocialId;
    }
}
