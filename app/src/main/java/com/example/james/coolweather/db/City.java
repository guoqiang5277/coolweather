package com.example.james.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by james on 2017/12/2.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceID;
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return this.cityName;
    }
    public int getCityCode(){
        return this.cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getProvinceID(){
        return this.provinceID;
    }
    public void setProvinceID(int provinceID){
        this.provinceID = provinceID;
    }
}
