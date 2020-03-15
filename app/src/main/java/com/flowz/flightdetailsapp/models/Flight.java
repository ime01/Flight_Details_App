package com.flowz.flightdetailsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight {

    @SerializedName("Departure")
    @Expose
    private Departure departure;
    @SerializedName("Arrival")
    @Expose
    private Arrival arrival;
    @SerializedName("MarketingCarrier")
    @Expose
    private MarketingCarrier marketingCarrier;
    @SerializedName("OperatingCarrier")
    @Expose
    private OperatingCarrier operatingCarrier;
    @SerializedName("Equipment")
    @Expose
    private Equipment equipment;
    @SerializedName("FlightStatus")
    @Expose
    private FlightStatus flightStatus;
    @SerializedName("ServiceType")
    @Expose
    private String serviceType;

    public Departure getDeparture() {
        return departure;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    public MarketingCarrier getMarketingCarrier() {
        return marketingCarrier;
    }

    public void setMarketingCarrier(MarketingCarrier marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    public OperatingCarrier getOperatingCarrier() {
        return operatingCarrier;
    }

    public void setOperatingCarrier(OperatingCarrier operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
