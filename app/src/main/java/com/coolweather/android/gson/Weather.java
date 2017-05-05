package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ch on 2017/5/4.
 *
 * 返回数据的大致格式
 * {
 *     "HeWeather":[
 *          {
 *              "status":"ok",
 *              "basic":{}
 *              "aqi":{}
 *              "now":{}
 *              "suggestion":{}
 *              "daily_forecast":{}
 *          }
 *
 *     ]
 * }
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
