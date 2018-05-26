package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/** Created by grang on 13/09/2017. */
public class GetSalesRequest {
  public String toJson(Moshi moshi) {
    JsonAdapter<GetSalesRequest> adapter = moshi.adapter(GetSalesRequest.class);
    return adapter.toJson(this);
  }

  @Json(name = "seller_payme_id")
  private String sellerPaymeId;

  @Json(name = "seller_id")
  private String sellerId;

  @Json(name = "sale_payme_code")
  private Long salePaymeCode;

  @Json(name = "sale_payme_id")
  private String salePaymeId;

  @Json(name = "transaction_id")
  private String transactionId;

  @Json(name = "sale_created")
  private String saleCreated;

  @Json(name = "sale_created_min")
  private String saleCreatedMin;

  @Json(name = "sale_created_max")
  private String saleCreatedMax;

  @Json(name = "sale_status")
  private String saleStatus;

  @Json(name = "sale_price")
  private Long salePrice;

  @Json(name = "sale_currency")
  private String saleCurrency;

  @Json(name = "sale_auth_number")
  private String saleAuthNumber;

  @Json(name = "buyer_card_mask")
  private String buyerCardMask;

  @Json(name = "buyer_card_last_four_digits")
  private String buyerCardLastFourDigits;

  @Json(name = "buyer_name")
  private String buyerName;

  @Json(name = "buyer_email")
  private String buyerEmail;

  @Json(name = "buyer_phone")
  private String buyerPhone;

  @Json(name = "buyer_social_id")
  private String buyerSocialId;

  @Json(name = "buyer_card_is_foreign")
  private Boolean buyerCardisForeign;

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

  public Long getSalePaymeCode() {
    return salePaymeCode;
  }

  public void setSalePaymeCode(Long salePaymeCode) {
    this.salePaymeCode = salePaymeCode;
  }

  public String getSalePaymeId() {
    return salePaymeId;
  }

  public void setSalePaymeId(String salePaymeId) {
    this.salePaymeId = salePaymeId;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getSaleCreated() {
    return saleCreated;
  }

  public void setSaleCreated(String saleCreated) {
    this.saleCreated = saleCreated;
  }

  public String getSaleCreatedMin() {
    return saleCreatedMin;
  }

  public void setSaleCreatedMin(String saleCreatedMin) {
    this.saleCreatedMin = saleCreatedMin;
  }

  public String getSaleCreatedMax() {
    return saleCreatedMax;
  }

  public void setSaleCreatedMax(String saleCreatedMax) {
    this.saleCreatedMax = saleCreatedMax;
  }

  public String getSaleStatus() {
    return saleStatus;
  }

  public void setSaleStatus(String saleStatus) {
    this.saleStatus = saleStatus;
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

  public String getSaleAuthNumber() {
    return saleAuthNumber;
  }

  public void setSaleAuthNumber(String saleAuthNumber) {
    this.saleAuthNumber = saleAuthNumber;
  }

  public String getBuyerCardMask() {
    return buyerCardMask;
  }

  public void setBuyerCardMask(String buyerCardMask) {
    this.buyerCardMask = buyerCardMask;
  }

  public String getBuyerCardLastFourDigits() {
    return buyerCardLastFourDigits;
  }

  public void setBuyerCardLastFourDigits(String buyerCardLastFourDigits) {
    this.buyerCardLastFourDigits = buyerCardLastFourDigits;
  }

  public String getBuyerName() {
    return buyerName;
  }

  public void setBuyerName(String buyerName) {
    this.buyerName = buyerName;
  }

  public String getBuyerEmail() {
    return buyerEmail;
  }

  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  public String getBuyerPhone() {
    return buyerPhone;
  }

  public void setBuyerPhone(String buyerPhone) {
    this.buyerPhone = buyerPhone;
  }

  public String getBuyerSocialId() {
    return buyerSocialId;
  }

  public void setBuyerSocialId(String buyerSocialId) {
    this.buyerSocialId = buyerSocialId;
  }

  public Boolean getBuyerCardisForeign() {
    return buyerCardisForeign;
  }

  public void setBuyerCardisForeign(Boolean buyerCardisForeign) {
    this.buyerCardisForeign = buyerCardisForeign;
  }
}
