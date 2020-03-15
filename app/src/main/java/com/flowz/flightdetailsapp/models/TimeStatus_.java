package com.flowz.flightdetailsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TimeStatus_ {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Definition")
    @Expose
    private String definition;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

}
