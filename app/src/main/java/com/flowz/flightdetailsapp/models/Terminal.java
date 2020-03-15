package com.flowz.flightdetailsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Terminal {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Gate")
    @Expose
    private String gate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

}
