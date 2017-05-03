package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by ch on 2017/5/3.
 */

public class County extends DataSupport {
    private int id;

    private String countyName;

    private String weatherId;           //对应的天气的id

    private String cityId;              //所属城市的id

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
