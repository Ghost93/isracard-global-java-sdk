package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/**
 * Created by loiho on 5/10/16.
 */
public class PaySaleResponse {

  public static PaySaleResponse fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<PaySaleResponse> adapter = moshi.adapter(PaySaleResponse.class);
    return adapter.fromJson(json);
  }

  @Json(name = "status_code") Integer statusCode;
  @Json(name = "payme_status") String paymeStatus;
  @Json(name = "status_error_code") Integer statusErrorCode;
  @Json(name = "payme_sale_id") String paymeSaleId;
  @Json(name = "payme_sale_code") Integer paymeSaleCode;
  @Json(name = "sale_created") String saleCreated;
  @Json(name = "payme_sale_status") String paymeSaleStatus;
  @Json(name = "sale_status") String saleStatus;
  @Json(name = "currency") String currency;
  @Json(name = "transaction_id") String transactionId;
  @Json(name = "is_token_sale") Boolean isTokenSale;
  @Json(name = "price") Integer price;
  @Json(name = "payme_signature") String paymeSignature;
  @Json(name = "payme_transaction_id") String paymeTransactionId;
  @Json(name = "payme_transaction_total") String paymeTransactionTotal;
  @Json(name = "payme_transaction_card_brand") String paymeTransactionCardBrand;
  @Json(name = "payme_transaction_auth_number") String paymeTransactionAuthNumber;
  @Json(name = "buyer_name") String buyerName;
  @Json(name = "buyer_email") String buyerEmail;
  @Json(name = "buyer_phone") String buyerPhone;
  @Json(name = "buyer_card_mask") String buyerCardMask;
  @Json(name = "buyer_card_exp") String buyerCardExp;
  @Json(name = "buyer_social_id") String buyerSocialId;
  @Json(name = "installments") Integer installments;
  @Json(name = "sale_paid_date") String salePaidDate;
  @Json(name = "sale_release_date") String saleReleaseDate;

  public Integer getStatusCode() {
    return statusCode;
  }

  public String getPaymeStatus() {
    return paymeStatus;
  }

  public Integer getStatusErrorCode() {
    return statusErrorCode;
  }

  public String getPaymeSaleId() {
    return paymeSaleId;
  }

  public Integer getPaymeSaleCode() {
    return paymeSaleCode;
  }

  public String getSaleCreated() {
    return saleCreated;
  }

  public String getPaymeSaleStatus() {
    return paymeSaleStatus;
  }

  public String getSaleStatus() {
    return saleStatus;
  }

  public String getCurrency() {
    return currency;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public Boolean getTokenSale() {
    return isTokenSale;
  }

  public Integer getPrice() {
    return price;
  }

  public String getPaymeSignature() {
    return paymeSignature;
  }

  public String getPaymeTransactionId() {
    return paymeTransactionId;
  }

  public String getPaymeTransactionTotal() {
    return paymeTransactionTotal;
  }

  public String getPaymeTransactionCardBrand() {
    return paymeTransactionCardBrand;
  }

  public String getPaymeTransactionAuthNumber() {
    return paymeTransactionAuthNumber;
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

  public String getBuyerCardMask() {
    return buyerCardMask;
  }

  public String getBuyerCardExp() {
    return buyerCardExp;
  }

  public String getBuyerSocialId() {
    return buyerSocialId;
  }

  public Integer getInstallments() {
    return installments;
  }

  public String getSalePaidDate() {
    return salePaidDate;
  }

  public String getSaleReleaseDate() {
    return saleReleaseDate;
  }
}
