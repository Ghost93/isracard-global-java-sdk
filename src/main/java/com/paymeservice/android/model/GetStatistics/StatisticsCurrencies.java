package com.paymeservice.android.model.GetStatistics;

import com.paymeservice.android.model.GetGraphPoints.GraphPointsStatuses;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/** Created by grang on 19/09/2017. */
public class StatisticsCurrencies {
  public static GraphPointsStatuses fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<GraphPointsStatuses> adapter = moshi.adapter(GraphPointsStatuses.class);
    return adapter.fromJson(json);
  }

  @Json(name = "ILS")
  private StatisticsStatuses ils;

  @Json(name = "USD")
  private StatisticsStatuses usd;

  @Json(name = "EUR")
  private StatisticsStatuses eur;

  public StatisticsStatuses getIls() {
    return ils;
  }

  public StatisticsStatuses getUsd() {
    return usd;
  }

  public StatisticsStatuses getEur() {
    return eur;
  }
}
