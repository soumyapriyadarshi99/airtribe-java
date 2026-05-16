package com.airtribe.ridewise.strategy;

import com.airtribe.ridewise.model.Ride;

public interface FareStrategy {
    public double calculateFare(Ride ride);
}
