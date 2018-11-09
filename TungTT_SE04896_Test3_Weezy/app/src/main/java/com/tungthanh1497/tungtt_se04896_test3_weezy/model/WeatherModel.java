package com.tungthanh1497.tungtt_se04896_test3_weezy.model;

public class WeatherModel {
    private String weatherName;
    private double temp;
    private int humidity;
    private double speed;
    private String cityName;
    private String icon;


    public String getIcon() {

        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public WeatherModel() {
    }

    public String getWeatherName() {

        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
