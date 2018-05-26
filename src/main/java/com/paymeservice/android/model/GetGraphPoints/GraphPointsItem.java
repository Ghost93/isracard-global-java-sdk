package com.paymeservice.android.model.GetGraphPoints;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.util.List;

/** Created by grang on 19/09/2017. */
public class GraphPointsItem {
  public static GraphPointsItem fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<GraphPointsItem> adapter = moshi.adapter(GraphPointsItem.class);
    return adapter.fromJson(json);
  }

  @Json(name = "labels")
  private List<String> labels;

  @Json(name = "ILS")
  private List<Long> ils;

  @Json(name = "USD")
  private List<Long> usd;

  @Json(name = "EUR")
  private List<Long> eur;

  public List<String> getLabels() {
    return labels;
  }

  public List<Long> getIls() {
    return ils;
  }

  public List<Long> getUsd() {
    return usd;
  }

  public List<Long> getEur() {
    return eur;
  }
}
