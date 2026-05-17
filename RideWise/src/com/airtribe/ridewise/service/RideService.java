package com.airtribe.ridewise.service;

import com.airtribe.ridewise.exception.NoDriverAvailableException;
import com.airtribe.ridewise.model.*;
import com.airtribe.ridewise.strategy.FareStrategy;
import com.airtribe.ridewise.strategy.RideMatchingStrategy;
import com.airtribe.ridewise.util.IdGenerator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RideService {
    DriverService driverService;
    RideMatchingStrategy rideMatchingStrategy;
    FareStrategy fareStrategy;

    public RideService(DriverService driverService, RideMatchingStrategy rideMatchingStrategy, FareStrategy fareStrategy){
        this.driverService = driverService;
        this.fareStrategy = fareStrategy;
        this.rideMatchingStrategy = rideMatchingStrategy;
    }


    final Map<String,Ride> rides = new LinkedHashMap<>();

    public List<Ride> getAllRides(){
        return new ArrayList<>(rides.values());
    }

    public Ride requestRide(Rider rider, double distance){

        List<Driver> allAvailableDrivers = driverService.getAllAvailableDrivers();

        Driver driver = rideMatchingStrategy.findDriver(rider,allAvailableDrivers);
        if(driver == null){
            throw new NoDriverAvailableException("No available drivers...");
        }

        String rideId = IdGenerator.nextRideId();
        Ride ride = new Ride(rideId,rider,distance);
        ride.setDriver(driver);
        ride.setStatus(String.valueOf(RideStatus.ASSIGNED));

        driver.setAvailable(false);

        rides.put(rideId, ride);

        return ride;
    }

    public FareReceipt completeRide(String rideId){
        Ride rideToComplete = rides.get(rideId);
        if(rideToComplete == null){
            throw new IllegalArgumentException("No ride found for this id...");
        }
        rideToComplete.setStatus(String.valueOf(RideStatus.COMPLETED));

        Driver rideCompletedDriver = rideToComplete.getDriver();
        rideCompletedDriver.setAvailable(true);
        rideCompletedDriver.setTotalRidesCompleted(rideCompletedDriver.getTotalRidesCompleted()+1);

        double fare = fareStrategy.calculateFare(rideToComplete);

        return new FareReceipt(rideId,fare);
    }

    public Ride cancelRide(String rideId){
        Ride rideToCancel = rides.get(rideId);
        if(rideToCancel == null){
            throw new IllegalArgumentException("No ride found for this id");
        }
        rideToCancel.setStatus(String.valueOf(RideStatus.CANCELLED));

        Driver rideCancelledDriver = rideToCancel.getDriver();
        if(rideCancelledDriver !=null){
            rideCancelledDriver.setAvailable(true);
        }

        return rideToCancel;

    }
}
