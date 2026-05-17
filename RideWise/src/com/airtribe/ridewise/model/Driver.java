package com.airtribe.ridewise.model;

public class Driver {
    String id;
    String name;
    String location;
    boolean available;
    int totalRidesCompleted;

    public Driver(String id, String name, String location, boolean available, int totalRidesCompleted) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.available = available;
        this.totalRidesCompleted = totalRidesCompleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", available=" + available +
                ", totalRidesCompleted=" + totalRidesCompleted +
                '}';
    }
}
