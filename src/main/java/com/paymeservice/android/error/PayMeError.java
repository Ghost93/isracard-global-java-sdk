package com.paymeservice.android.error;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/**
 * Created by loiho on 5/10/16.
 */
public class PayMeError {

  @Json(name = "status_code") private int statusCode;
  @Json(name = "status_additional_info") private String statusAdditionalInfo;
  @Json(name = "status_error_code") private int statusErrorCode;
  @Json(name = "status_error_details") private String statusErrorDetails;

  public static PayMeError fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<PayMeError> adapter = moshi.adapter(PayMeError.class);
    return adapter.fromJson(json);
  }


  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getStatusErrorDetails() {
    return statusErrorDetails;
  }

  public void setStatusErrorDetails(String statusErrorDetails) {
    this.statusErrorDetails = statusErrorDetails;
  }

  public String getStatusAdditionalInfo() {
    return statusAdditionalInfo;
  }

  public void setStatusAdditionalInfo(String statusAdditionalInfo) {
    this.statusAdditionalInfo = statusAdditionalInfo;
  }

  public int getStatusErrorCode() {
    return statusErrorCode;
  }

  public void setStatusErrorCode(int statusErrorCode) {
    this.statusErrorCode = statusErrorCode;
  }
}
