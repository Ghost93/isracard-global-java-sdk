package com.paymeservice.android.model.GetStatistics;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/** Created by LoiHo on 6/27/16. */
public class GetStatisticsResponse {
  public static GetStatisticsResponse fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<GetStatisticsResponse> adapter = moshi.adapter(GetStatisticsResponse.class);
    return adapter.fromJson(json);
  }

  @Json(name = "start_date")
  private String startDate;

  @Json(name = "end_date")
  private String endDate;

  @Json(name = "currencies")
  private StatisticsCurrencies currencies;

  @Json(name = "status_code")
  private Integer statusCode;

  public String getStartDate() {
    return startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public StatisticsCurrencies getCurrencies() {
    return currencies;
  }

  public Integer getStatusCode() {
    return statusCode;
  }
}
