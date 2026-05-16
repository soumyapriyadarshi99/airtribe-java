package com.airtribe.ridewise.model;

public class Ride {
    Long id;
    Rider rider;
    Driver driver;
    double distance;
    String status;


    public Ride(Long id, Rider rider, double distance) {
        this.id = id;
        this.rider = rider;
        this.driver = null;
        this.distance = distance;
        this.status = String.valueOf(RiderStatus.REQUESTED);
    }

    public Long getId() {
        return id;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getDistance() {
        return distance;
    }

    public String getStatus() {
        return status;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
