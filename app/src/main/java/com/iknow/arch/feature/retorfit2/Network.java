package com.iknow.arch.feature.retorfit2;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * @Author: J.Chou
 * @Email: who_know_me@163.com
 * @Created: 2016年05月09日 4:07 PM
 * @Description:
 */

public class Network {
    protected final String TAG = getClass().getSimpleName();
    static final String API_URL="http://api.openweathermap.org";

    public static NetworkApi getNetworkApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        return retrofit.create(NetworkApi.class);
    }

}
