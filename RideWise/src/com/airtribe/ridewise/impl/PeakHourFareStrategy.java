package com.airtribe.ridewise.impl;

import com.airtribe.ridewise.model.Ride;
import com.airtribe.ridewise.strategy.FareStrategy;
import com.airtribe.ridewise.util.FareCalculator;

import java.time.LocalDateTime;

public class PeakHourFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(Ride ride){
        double baseFare=FareCalculator.baseFare(ride.getDistance());
        return isPeakHour() ? baseFare*1.5 : baseFare;
    }

    private boolean isPeakHour() {
        int currentHour = LocalDateTime.now().getHour();
        boolean morningPeak = currentHour >= 8 && currentHour <= 10;
        boolean eveningPeak = currentHour >= 17 && currentHour <= 19;
        return morningPeak || eveningPeak;
    }
}
