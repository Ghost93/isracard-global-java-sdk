package com.paymeservice.android.model.GetStatistics;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/** Created by grang on 19/09/2017. */
@Keep
public class StatisticsStatuses {
  public static StatisticsStatuses fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<StatisticsStatuses> adapter = moshi.adapter(StatisticsStatuses.class);
    return adapter.fromJson(json);
  }

  @Json(name = "validated")
  private StatisticsItem validated;

  @Json(name = "refunded")
  private StatisticsItem refunded;

  public StatisticsItem getValidated() {
    return validated;
  }

  public StatisticsItem getRefunded() {
    return refunded;
  }
}
