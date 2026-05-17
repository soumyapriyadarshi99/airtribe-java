package com.airtribe.ridewise.impl;

import com.airtribe.ridewise.model.Driver;
import com.airtribe.ridewise.model.Rider;
import com.airtribe.ridewise.strategy.RideMatchingStrategy;

import java.util.List;

public class NearestDriverStrategy implements RideMatchingStrategy {

    @Override
    public Driver findDriver(Rider rider, List<Driver> drivers){

        return drivers.stream().filter(driver -> driver.getLocation()
                        .equalsIgnoreCase(rider.getLocation()))
                        .findFirst()
                        .orElseThrow(null);

    }
}
