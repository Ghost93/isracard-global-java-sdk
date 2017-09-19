package com.paymeservice.android.model.GetStatistics;

import android.support.annotation.Keep;

import com.paymeservice.android.model.GetGraphPoints.GraphPointsItem;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.util.List;

/**
 * Created by grang on 19/09/2017.
 */

@Keep
public class StatisticsItem {
    public static GraphPointsItem fromJson(Moshi moshi, String json) throws IOException {
        JsonAdapter<GraphPointsItem> adapter = moshi.adapter(GraphPointsItem.class);
        return adapter.fromJson(json);
    }
    @Json(name = "sum") private Long sum;
    @Json(name = "count") private Integer count;
    @Json(name = "average") private Long average;
    @Json(name = "percentage") private Integer  percentage;

    public Long getSum() {
        return sum;
    }

    public Integer getCount() {
        return count;
    }

    public Long getAverage() {
        return average;
    }

    public Integer getPercentage() {
        return percentage;
    }
}
