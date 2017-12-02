package com.example.james.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by james on 2017/12/2.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherID;
    private int cityID;
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return this.countyName;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public String getWeatherID(){
        return this.weatherID;
    }
    public void setWeatherID(String weatherID){
        this.weatherID = weatherID;
    }
    public int getCityID(){
        return this.cityID;
    }
    public void setCityID(int cityID){
        this.cityID = cityID;
    }
}
