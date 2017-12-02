package com.example.james.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by james on 2017/12/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherID;

    public Update update;
    public  class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
