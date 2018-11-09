package com.tungthanh1497.tungtt_se04896_test3_weezy.network.models;

import com.google.gson.annotations.SerializedName;

public class Wind {


    @SerializedName("speed")
    private double speed;


    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return
                "Wind{" +
                        ",speed = '" + speed + '\'' +
                        "}";
    }
}