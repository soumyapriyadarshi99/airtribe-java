package com.airtribe.ridewise.model;

public class Driver {
    Long id;
    String name;
    String location;
    boolean available;
    int totalRidesCompleted;

    public Driver(Long id, String name, String location, boolean available, int totalRidesCompleted) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.available = available;
        this.totalRidesCompleted = totalRidesCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getTotalRidesCompleted() {
        return totalRidesCompleted;
    }

    public void setTotalRidesCompleted(int totalRidesCompleted) {
        this.totalRidesCompleted = totalRidesCompleted;
    }
}
