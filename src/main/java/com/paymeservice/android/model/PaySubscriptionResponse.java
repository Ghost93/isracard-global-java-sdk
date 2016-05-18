package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/**
 * Created by LoiHo on 5/17/16.
 */
public class PaySubscriptionResponse {

  public static PaySubscriptionResponse fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<PaySubscriptionResponse> adapter = moshi.adapter(PaySubscriptionResponse.class);
    return adapter.fromJson(json);
  }

  @Json(name = "status_code") private Integer statusCode;
  @Json(name = "payme_status") private String paymeStatus;
  @Json(name = "status_error_code") private Integer statusErrorCode;
  @Json(name = "seller_payme_id") private String sellerPaymeId;
  @Json(name = "seller_id") private String sellerId;
  @Json(name = "sub_payme_id") private String subPaymeId;
  @Json(name = "sub_payme_code") private Integer subPaymeCode;
  @Json(name = "sub_created") private String subCreated;
  @Json(name = "sub_start_date") private String subStartDate;
  @Json(name = "sub_prev_date") private Object subPrevDate;
  @Json(name = "sub_next_date") private String subNextDate;
  @Json(name = "sub_status") private Integer subStatus;
  @Json(name = "sub_iteration_type") private Integer subIterationType;
  @Json(name = "sub_currency") private String subCurrency;
  @Json(name = "sub_price") private Integer subPrice;
  @Json(name = "sub_description") private String subDescription;
  @Json(name = "sub_iterations") private Integer subIterations;
  @Json(name = "sub_iterations_completed") private Integer subIterationsCompleted;
  @Json(name = "sub_iterations_left") private Integer subIterationsLeft;
  @Json(name = "sub_paid") private Boolean subPaid;
  @Json(name = "sub_error_text") private Object subErrorText;
  @Json(name = "sub_payment_date") private String subPaymentDate;
  @Json(name = "buyer_card_mask") private String buyerCardMask;
  @Json(name = "buyer_name") private String buyerName;
  @Json(name = "buyer_email") private String buyerEmail;
  @Json(name = "buyer_phone") private String buyerPhone;
  @Json(name = "buyer_social_id") private String buyerSocialId;

  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public String getPaymeStatus() {
    return paymeStatus;
  }

  public void setPaymeStatus(String paymeStatus) {
    this.paymeStatus = paymeStatus;
  }

  public Integer getStatusErrorCode() {
    return statusErrorCode;
  }

  public void setStatusErrorCode(Integer statusErrorCode) {
    this.statusErrorCode = statusErrorCode;
  }

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

  public String getSubPaymeId() {
    return subPaymeId;
  }

  public void setSubPaymeId(String subPaymeId) {
    this.subPaymeId = subPaymeId;
  }

  public Integer getSubPaymeCode() {
    return subPaymeCode;
  }

  public void setSubPaymeCode(Integer subPaymeCode) {
    this.subPaymeCode = subPaymeCode;
  }

  public String getSubCreated() {
    return subCreated;
  }

  public void setSubCreated(String subCreated) {
    this.subCreated = subCreated;
  }

  public String getSubStartDate() {
    return subStartDate;
  }

  public void setSubStartDate(String subStartDate) {
    this.subStartDate = subStartDate;
  }

  public Object getSubPrevDate() {
    return subPrevDate;
  }

  public void setSubPrevDate(Object subPrevDate) {
    this.subPrevDate = subPrevDate;
  }

  public String getSubNextDate() {
    return subNextDate;
  }

  public void setSubNextDate(String subNextDate) {
    this.subNextDate = subNextDate;
  }

  public Integer getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(Integer subStatus) {
    this.subStatus = subStatus;
  }

  public Integer getSubIterationType() {
    return subIterationType;
  }

  public void setSubIterationType(Integer subIterationType) {
    this.subIterationType = subIterationType;
  }

  public String getSubCurrency() {
    return subCurrency;
  }

  public void setSubCurrency(String subCurrency) {
    this.subCurrency = subCurrency;
  }

  public Integer getSubPrice() {
    return subPrice;
  }

  public void setSubPrice(Integer subPrice) {
    this.subPrice = subPrice;
  }

  public String getSubDescription() {
    return subDescription;
  }

  public void setSubDescription(String subDescription) {
    this.subDescription = subDescription;
  }

  public Integer getSubIterations() {
    return subIterations;
  }

  public void setSubIterations(Integer subIterations) {
    this.subIterations = subIterations;
  }

  public Integer getSubIterationsCompleted() {
    return subIterationsCompleted;
  }

  public void setSubIterationsCompleted(Integer subIterationsCompleted) {
    this.subIterationsCompleted = subIterationsCompleted;
  }

  public Integer getSubIterationsLeft() {
    return subIterationsLeft;
  }

  public void setSubIterationsLeft(Integer subIterationsLeft) {
    this.subIterationsLeft = subIterationsLeft;
  }

  public Boolean getSubPaid() {
    return subPaid;
  }

  public void setSubPaid(Boolean subPaid) {
    this.subPaid = subPaid;
  }

  public Object getSubErrorText() {
    return subErrorText;
  }

  public void setSubErrorText(Object subErrorText) {
    this.subErrorText = subErrorText;
  }

  public String getSubPaymentDate() {
    return subPaymentDate;
  }

  public void setSubPaymentDate(String subPaymentDate) {
    this.subPaymentDate = subPaymentDate;
  }

  public String getBuyerCardMask() {
    return buyerCardMask;
  }

  public void setBuyerCardMask(String buyerCardMask) {
    this.buyerCardMask = buyerCardMask;
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
}
