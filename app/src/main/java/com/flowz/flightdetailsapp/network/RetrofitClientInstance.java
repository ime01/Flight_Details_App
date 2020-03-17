package com.flowz.flightdetailsapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    public static Retrofit retrofit;

    private static final  String BASE_URL = "https://api.lufthansa.com/";

   // private static final  String BASE_URL = "https://api-test.lufthansa.com/";




    public static Retrofit getRetrofitInstance(){
                if (retrofit==null){

                   retrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }return retrofit;

    }


}
