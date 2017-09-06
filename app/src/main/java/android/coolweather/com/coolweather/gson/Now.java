package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 123 on 2017/9/2.
 */

public class Now {
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public String temperature;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
