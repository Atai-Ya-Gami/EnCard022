package com.geekteck.encard02;

import android.app.Application;

import com.geekteck.encard02.network.PixabayApi;
import com.geekteck.encard02.network.RetrofitClient;

public class App extends Application {
    RetrofitClient retrofitClient;
    PixabayApi pixabayApi;
    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        pixabayApi = retrofitClient.getPixabayApi();
    }
}
