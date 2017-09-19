package com.paymeservice.android.model.GetGraphPoints;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

/**
 * Created by LoiHo on 6/27/16.
 */
public class GetGraphPointsResponse {
  public static GetGraphPointsResponse fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<GetGraphPointsResponse> adapter = moshi.adapter(GetGraphPointsResponse.class);
    return adapter.fromJson(json);
  }
  @Json(name = "start_date") private String startDate;
  @Json(name = "end_date") private String endDate;
  @Json(name = "statuses") private GraphPointsStatuses statuses;
  @Json(name = "status_code") private Integer statusCode;


  public String getStartDate() {
    return startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public GraphPointsStatuses getStatuses() {
    return statuses;
  }

  public Integer getStatusCode() {
    return statusCode;
  }
}
