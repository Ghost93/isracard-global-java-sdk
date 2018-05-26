package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/** Created by grang on 13/09/2017. */
public class FinancialTransactionsResponseItem {
  public static FinancialTransactionsResponseItem fromJson(Moshi moshi, String json)
      throws IOException {
    JsonAdapter<FinancialTransactionsResponseItem> adapter =
        moshi.adapter(FinancialTransactionsResponseItem.class);
    return adapter.fromJson(json);
  }

  @Json(name = "seller_payme_id")
  private String sellerPaymeId;

  @Json(name = "seller_id")
  private String sellerId;

  @Json(name = "tran_created")
  private String tranCreated;

  @Json(name = "tran_type")
  private String tranType;

  @Json(name = "sale_payme_code")
  private Long salePaymeCode;

  @Json(name = "tran_currency")
  private String tranCurrency;

  @Json(name = "tran_total")
  private Long tranTotal;

  @Json(name = "tran_description")
  private String tranDescription;

  public String getSellerPaymeId() {
    return sellerPaymeId;
  }

  public String getSellerId() {
    return sellerId;
  }

  public String getTranCreated() {
    return tranCreated;
  }

  public String getTranType() {
    return tranType;
  }

  public Long getSalePaymeCode() {
    return salePaymeCode;
  }

  public String getTranCurrency() {
    return tranCurrency;
  }

  public Long getTranTotal() {
    return tranTotal;
  }

  public String getTranDescription() {
    return tranDescription;
  }
}
