package com.airtribe.ridewise.impl;

import com.airtribe.ridewise.model.Driver;
import com.airtribe.ridewise.model.Rider;
import com.airtribe.ridewise.strategy.RideMatchingStrategy;

import java.util.ArrayList;
import java.util.List;

public class LeastDriverStrategy implements RideMatchingStrategy {

    @Override
    public Driver findDriver(Rider rider, List<Driver> drivers){
        int leastDriveCount = Integer.MAX_VALUE;
        Driver driverWithLeastRides = null;

        for (Driver driver: drivers){
            if(driver.getTotalRidesCompleted() <=leastDriveCount){
                leastDriveCount = driver.getTotalRidesCompleted();
                driverWithLeastRides = driver;
            }
        }
        return driverWithLeastRides;
    }
}
