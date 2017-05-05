package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 由于JSON中的一些字段可能不适合直接作为java字段命名，因此这里使用
 *  @SerializedName（）注解的方式来让JSON和java字段之间建立映射关系
 * Created by ch on 2017/5/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
