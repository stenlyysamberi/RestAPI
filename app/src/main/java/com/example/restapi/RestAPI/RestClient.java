package com.example.restapi.RestAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static Retrofit retrofit;

    private static final String BASE_URL ="http://192.168.42.193:8000/api/";
    //private static final String  BASE_URL = "http://192.168.42.102/kasir/api/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
