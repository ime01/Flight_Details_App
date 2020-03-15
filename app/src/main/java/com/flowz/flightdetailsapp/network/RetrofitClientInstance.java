package com.flowz.flightdetailsapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static final  String BASE_URL = "https://api.lufthansa.com/v1/operations/flightstatus/route/FRA/JFK/2020-03-18?serviceType=passenger";

    public static Retrofit getRetrofitInstance(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }


}
