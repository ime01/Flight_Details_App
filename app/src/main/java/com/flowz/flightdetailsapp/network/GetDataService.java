package com.flowz.flightdetailsapp.network;

import com.flowz.flightdetailsapp.models.PojoClass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/airports/FRA")
    Call<List<PojoClass>> getFlights();
}
