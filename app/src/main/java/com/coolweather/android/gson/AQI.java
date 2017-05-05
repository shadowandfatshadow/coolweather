package com.coolweather.android.gson;

/**
 * Created by ch on 2017/5/4.
 */

public class AQI {
    public AQIcity city;

    public class AQIcity{
        public String aqi;
        public String pm25;
    }
}
