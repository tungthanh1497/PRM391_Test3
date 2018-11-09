package com.tungthanh1497.tungtt_se04896_test3_weezy.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    private static Retrofit retrofit;
    private static RetrofitFactory retrofitFactory = new RetrofitFactory();

    public static RetrofitFactory getInstance() {
        return retrofitFactory;
    }

    private RetrofitFactory() {
        retrofit = new Retrofit.Builder().baseUrl("https://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public <T> T create(final Class<T> service) {
        return retrofit.create(service);
    }

}