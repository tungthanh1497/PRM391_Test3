package com.tungthanh1497.tungtt_se04896_test3_weezy.network.models;


import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    private double temp;

    @SerializedName("humidity")
    private int humidity;

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return
                "Main{" +
                        "temp = '" + temp + '\'' +
                        ",humidity = '" + humidity + '\'' +
                        "}";
    }
}