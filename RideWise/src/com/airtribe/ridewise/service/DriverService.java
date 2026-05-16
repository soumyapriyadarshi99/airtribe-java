package com.airtribe.ridewise.service;

import com.airtribe.ridewise.model.Driver;
import com.airtribe.ridewise.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class DriverService {
    private final Map<String, Driver> drivers = new LinkedHashMap<>();

    public Driver registerDriver(String name, String location){
        String driverId = IdGenerator.nextDriverId();
        Driver createdDriver = new Driver(driverId,name,location, true, 0);
        drivers.put(driverId,createdDriver);
        return createdDriver;
    }

    public Driver getDriverById(String id){
        return drivers.get(id);
    }

    public List<Driver> getAllDrivers(){
        return new ArrayList<>(drivers.values());
    }

    public List<Driver> getAllAvailableDrivers(){
        return drivers.values().stream()
                .filter(Driver::isAvailable)
                .collect(Collectors.toList());
    }

}
