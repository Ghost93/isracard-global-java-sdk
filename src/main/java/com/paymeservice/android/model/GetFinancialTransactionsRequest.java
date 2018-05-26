package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/** Created by grang on 13/09/2017. */
public class GetFinancialTransactionsRequest {
  public String toJson(Moshi moshi) {
    JsonAdapter<GetFinancialTransactionsRequest> adapter =
        moshi.adapter(GetFinancialTransactionsRequest.class);
    return adapter.toJson(this);
  }

  @Json(name = "seller_payme_id")
  private String sellerPaymeId;

  @Json(name = "seller_id")
  private String sellerId;

  @Json(name = "tran_created")
  private String tranCreated;

  @Json(name = "tran_created_min")
  private String tranCreatedMin;

  @Json(name = "tran_created_max")
  private String tranCreatedMax;

  @Json(name = "tran_type")
  private Integer tranType;

  @Json(name = "tran_total")
  private Long tranTotal;

  @Json(name = "tran_currency")
  private String tranCurrency;

  public String getSellerPaymeId() {
    return sellerPaymeId;
  }

  public void setSellerPaymeId(String sellerPaymeId) {
    this.sellerPaymeId = sellerPaymeId;
  }

  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public String getTranCreated() {
    return tranCreated;
  }

  public void setTranCreated(String tranCreated) {
    this.tranCreated = tranCreated;
  }

  public String getTranCreatedMin() {
    return tranCreatedMin;
  }

  public void setTranCreatedMin(String tranCreatedMin) {
    this.tranCreatedMin = tranCreatedMin;
  }

  public String getTranCreatedMax() {
    return tranCreatedMax;
  }

  public void setTranCreatedMax(String tranCreatedMax) {
    this.tranCreatedMax = tranCreatedMax;
  }

  public Integer getTranType() {
    return tranType;
  }

  public void setTranType(Integer tranType) {
    this.tranType = tranType;
  }

  public Long getTranTotal() {
    return tranTotal;
  }

  public void setTranTotal(Long tranTotal) {
    this.tranTotal = tranTotal;
  }

  public String getTranCurrency() {
    return tranCurrency;
  }

  public void setTranCurrency(String tranCurrency) {
    this.tranCurrency = tranCurrency;
  }
}
