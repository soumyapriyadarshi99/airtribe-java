package com.airtribe.ridewise.util;

public class FareCalculator {
    private static final double BASE_FARE = 20.0;
    private static final double PER_KM_RATE = 10.0;
    public static double baseFare(double distance) {
        return BASE_FARE + (PER_KM_RATE * distance);
    }
}
