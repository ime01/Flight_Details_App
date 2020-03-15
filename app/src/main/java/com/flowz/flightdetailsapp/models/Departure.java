package com.flowz.flightdetailsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Departure {

    @SerializedName("AirportCode")
    @Expose
    private String airportCode;
    @SerializedName("ScheduledTimeLocal")
    @Expose
    private ScheduledTimeLocal scheduledTimeLocal;
    @SerializedName("ScheduledTimeUTC")
    @Expose
    private ScheduledTimeUTC scheduledTimeUTC;
    @SerializedName("TimeStatus")
    @Expose
    private TimeStatus timeStatus;
    @SerializedName("Terminal")
    @Expose
    private Terminal terminal;

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public ScheduledTimeLocal getScheduledTimeLocal() {
        return scheduledTimeLocal;
    }

    public void setScheduledTimeLocal(ScheduledTimeLocal scheduledTimeLocal) {
        this.scheduledTimeLocal = scheduledTimeLocal;
    }

    public ScheduledTimeUTC getScheduledTimeUTC() {
        return scheduledTimeUTC;
    }

    public void setScheduledTimeUTC(ScheduledTimeUTC scheduledTimeUTC) {
        this.scheduledTimeUTC = scheduledTimeUTC;
    }

    public TimeStatus getTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(TimeStatus timeStatus) {
        this.timeStatus = timeStatus;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

}
