package com.example.james.coolweather.gson;

/**
 * Created by james on 2017/12/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
