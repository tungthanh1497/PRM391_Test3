package com.tungthanh1497.tungtt_se04896_test3_weezy.network.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class GetWeatherResponseModel {


    @SerializedName("weather")
    private List<WeatherItem> weather;

    @SerializedName("name")
    private String name;


    @SerializedName("main")
    private Main main;


    @SerializedName("wind")
    private Wind wind;

    @Override
    public String toString() {
        return "GetWeatherResponseModel{" +
                "weather=" + weather +
                ", name='" + name + '\'' +
                ", main=" + main +
                ", wind=" + wind +
                '}';
    }

    public List<WeatherItem> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherItem> weather) {
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}