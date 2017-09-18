package com.paymeservice.android.model;

import com.squareup.moshi.Json;

/**
 * Created by grang on 14/09/2017.
 */

class SaleBuyerDetailsItem {
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
