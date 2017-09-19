package com.paymeservice.android.model.GetGraphPoints;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * Created by LoiHo on 6/27/16.
 */
public class GetGraphPointsRequest {
  public String toJson(Moshi moshi) {
    JsonAdapter<GetGraphPointsRequest> adapter = moshi.adapter(GetGraphPointsRequest.class);
    return adapter.toJson(this);
  }

  @Json(name = "seller_payme_id") private String sellerPaymeId;
  @Json(name = "timeframe") private String timeFrame;
  @Json(name = "date_format") private String dateFormat;

  public String getSellerPaymeId() {
    return sellerPaymeId;
  }

  public void setSellerPaymeId(String sellerPaymeId) {
    this.sellerPaymeId = sellerPaymeId;
  }

  public String getTimeFrame() {
    return timeFrame;
  }

  public void setTimeFrame(String timeFrame) {
    this.timeFrame = timeFrame;
  }

  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }
}
