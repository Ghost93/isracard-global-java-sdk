package com.paymeservice.android.model;

import android.support.annotation.Keep;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

/**
 * Created by grang on 13/09/2017.
 */

@Keep
public class SaleResponseItem {
    public static SaleResponseItem fromJson(Moshi moshi, String json) throws IOException {
        JsonAdapter<SaleResponseItem> adapter = moshi.adapter(SaleResponseItem.class);
        return adapter.fromJson(json);
    }
    @Json(name = "seller_payme_id") private String sellerPaymeId;
    @Json(name = "seller_id") private String sellerId;
    @Json(name = "sale_payme_id") private String salePaymeId;
    @Json(name = "sale_payme_code") private Long salePaymeCode;
    @Json(name = "transaction_id") private String transactionId;
    @Json(name = "sale_created") private String saleCreated;
    @Json(name = "sale_status") private String saleStatus;
    @Json(name = "sale_currency") private String saleCurrency;
    @Json(name = "sale_price") private Long salePrice;
    @Json(name = "sale_price_after_fees") private Long salePriceAfterFees;
    @Json(name = "sale_description") private String saleDescription;
    @Json(name = "sale_installments") private String saleInstallments;
    @Json(name = "sale_vat") private Double saleVat;
    @Json(name = "sale_paid_date") private String salePaidDate;
    @Json(name = "sale_auth_number") private String saleAuthNumber;
    @Json(name = "sale_release_date") private String saleReleaseDate;
    @Json(name = "sale_error_code") private String saleErrorCode;
    @Json(name = "sale_error_text") private String saleErrorText;
    @Json(name = "sale_fees") private SaleFeesItem saleFees;
    @Json(name = "sale_buyer_details") private SaleBuyerDetailsItem saleBuyerDetails;

    public String getSellerPaymeId() {
        return sellerPaymeId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getSalePaymeId() {
        return salePaymeId;
    }

    public Long getSalePaymeCode() {
        return salePaymeCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getSaleCreated() {
        return saleCreated;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public String getSaleCurrency() {
        return saleCurrency;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public Long getSalePriceAfterFees() {
        return salePriceAfterFees;
    }

    public String getSaleDescription() {
        return saleDescription;
    }

    public String getSaleInstallments() {
        return saleInstallments;
    }

    public Double getSaleVat() {
        return saleVat;
    }

    public String getSalePaidDate() {
        return salePaidDate;
    }

    public String getSaleAuthNumber() {
        return saleAuthNumber;
    }

    public String getSaleReleaseDate() {
        return saleReleaseDate;
    }

    public String getSaleErrorCode() {
        return saleErrorCode;
    }

    public String getSaleErrorText() {
        return saleErrorText;
    }

    public SaleFeesItem getSaleFees() {
        return saleFees;
    }

    public SaleBuyerDetailsItem getSaleBuyerDetails() {
        return saleBuyerDetails;
    }
}
