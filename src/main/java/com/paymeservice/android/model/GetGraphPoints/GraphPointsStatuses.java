package com.paymeservice.android.model.GetGraphPoints;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.IOException;

/** Created by grang on 19/09/2017. */
public class GraphPointsStatuses {
  public static GraphPointsStatuses fromJson(Moshi moshi, String json) throws IOException {
    JsonAdapter<GraphPointsStatuses> adapter = moshi.adapter(GraphPointsStatuses.class);
    return adapter.fromJson(json);
  }

  @Json(name = "validated")
  private GraphPointsItem validated;

  @Json(name = "refunded")
  private GraphPointsItem refunded;

  public GraphPointsItem getValidated() {
    return validated;
  }

  public GraphPointsItem getRefunded() {
    return refunded;
  }
}
