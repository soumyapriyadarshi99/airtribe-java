package com.airtribe.ridewise.impl;

import com.airtribe.ridewise.model.Ride;
import com.airtribe.ridewise.strategy.FareStrategy;
import com.airtribe.ridewise.util.FareCalculator;

public class DefaultFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(Ride ride){
        return FareCalculator.baseFare(ride.getDistance());
    }
}
