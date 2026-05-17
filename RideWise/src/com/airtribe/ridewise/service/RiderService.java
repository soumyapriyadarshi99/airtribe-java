package com.airtribe.ridewise.service;

import com.airtribe.ridewise.model.Rider;
import com.airtribe.ridewise.util.IdGenerator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RiderService {
    private final Map<String,Rider> riders = new LinkedHashMap<>();

    public Rider registerRider(String name, String location){
        String riderId = IdGenerator.nextRiderId();
        Rider registeredRider = new Rider(riderId,name, location);
        riders.put(riderId,registeredRider);
        return registeredRider;
    }
    
    public Rider getRiderById(String id){
        return riders.get(id);
    }

    public List<Rider> getAllRiders() {
        return new ArrayList<>(riders.values());
    }
}
