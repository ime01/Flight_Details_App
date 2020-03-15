package com.flowz.flightdetailsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class PojoClass {

    @SerializedName("FlightStatusResource")
    @Expose
    private FlightStatusResource flightStatusResource;

    public PojoClass(FlightStatusResource flightStatusResource) {
        this.flightStatusResource = flightStatusResource;
    }

    public FlightStatusResource getFlightStatusResource() {
        return flightStatusResource;
    }

    public void setFlightStatusResource(FlightStatusResource flightStatusResource) {
        this.flightStatusResource = flightStatusResource;
    }

}


