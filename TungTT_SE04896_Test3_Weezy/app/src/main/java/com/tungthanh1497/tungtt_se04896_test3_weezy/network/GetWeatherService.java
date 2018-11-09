package com.tungthanh1497.tungtt_se04896_test3_weezy.network;

import com.tungthanh1497.tungtt_se04896_test3_weezy.network.models.GetWeatherResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetWeatherService {
    @GET("weather?id=1581130&appid=a0befe4d69f185b6632ffc162336bd3a")
    Call<GetWeatherResponseModel> getWeather();
}
