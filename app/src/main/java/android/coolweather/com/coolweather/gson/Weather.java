package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 123 on 2017/9/2.
 */

public class Weather {
    public AQI aqi;
    public Basic basic;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    public Now now;
    public String status;
    public Suggestion suggestion;
}
