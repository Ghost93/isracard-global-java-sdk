package com.paymeservice.android.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;
import java.util.List;

/**
 * Created by grang on 13/09/2017.
 */

public class GetSalesResponse {
    public static GetSalesResponse fromJson(Moshi moshi, String json) throws IOException {
        JsonAdapter<GetSalesResponse> adapter = moshi.adapter(GetSalesResponse.class);
        return adapter.fromJson(json);
    }
    @Json(name = "status_code") private Integer statusCode;
    @Json(name = "items_count") private Integer itemsCount;
    @Json(name = "items") private List<SaleResponseItem> items;

    public Integer getStatusCode() {
        return statusCode;
    }


    public Integer getItemsCount() {
        return itemsCount;
    }

    public List<SaleResponseItem> getItems() {
        return items;
    }
}
