package com.geekteck.encard02.network;

import com.geekteck.encard02.model.PixabayResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayApi {
    @GET("api/?key=26245431-083caba3bf225d1071e033ed8")
    Call<PixabayResponse> getImages(@Query("q")String keyWord);

}
