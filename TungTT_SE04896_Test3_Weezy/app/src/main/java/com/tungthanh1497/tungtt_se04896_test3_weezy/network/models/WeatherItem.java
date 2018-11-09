package com.tungthanh1497.tungtt_se04896_test3_weezy.network.models;

import com.google.gson.annotations.SerializedName;

public class WeatherItem {


    @SerializedName("main")
    private String main;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @SerializedName("icon")
    private String icon;


    public void setMain(String main) {
        this.main = main;
    }

    public String getMain() {
        return main;
    }

    @Override
    public String toString() {
        return "WeatherItem{" +
                "main='" + main + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}