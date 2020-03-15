package com.flowz.flightdetailsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Arrival {

    @SerializedName("AirportCode")
    @Expose
    private String airportCode;
    @SerializedName("ScheduledTimeLocal")
    @Expose
    private ScheduledTimeLocal_ scheduledTimeLocal;
    @SerializedName("ScheduledTimeUTC")
    @Expose
    private ScheduledTimeUTC_ scheduledTimeUTC;
    @SerializedName("TimeStatus")
    @Expose
    private TimeStatus_ timeStatus;
    @SerializedName("Terminal")
    @Expose
    private Terminal_ terminal;

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public ScheduledTimeLocal_ getScheduledTimeLocal() {
        return scheduledTimeLocal;
    }

    public void setScheduledTimeLocal(ScheduledTimeLocal_ scheduledTimeLocal) {
        this.scheduledTimeLocal = scheduledTimeLocal;
    }

    public ScheduledTimeUTC_ getScheduledTimeUTC() {
        return scheduledTimeUTC;
    }

    public void setScheduledTimeUTC(ScheduledTimeUTC_ scheduledTimeUTC) {
        this.scheduledTimeUTC = scheduledTimeUTC;
    }

    public TimeStatus_ getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(TimeStatus_ timeStatus) {
        this.timeStatus = timeStatus;
    }

    public Terminal_ getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal_ terminal) {
        this.terminal = terminal;
    }

}
