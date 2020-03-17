package com.flowz.flightdetailsapp.network;

import com.flowz.flightdetailsapp.models.Arrival;
import com.flowz.flightdetailsapp.models.PojoClass;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface GetDataService {

    @Headers("Bearer: tcabgmvq7vuh8u2q29j85f7x")
    @GET("v1/operations/flightstatus/route/FRA/JFK/2020-03-18?serviceType=passenger")
   // Call<Arrival> getFlightsByRoute(@Query("FRA") String city, @Query("tcabgmvq7vuh8u2q29j85f7x") String apiKey);
    //Call<Arrival> getFlightsByRoute(@Query("FRA") String departure, @Query("JFK") String arrival);

    Call<Arrival> getFlightsByRoute(@Query("FRA") String departure, @Query("JFK") String arrival);



}
