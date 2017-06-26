package com.example.workshop.com.example.workshop.aop;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TripService {

    private Map<String, Trip> trips = new HashMap<String, Trip>();

    public TripService()
    {
        trips.put("ABC121",new Trip("ABC121","123121","A","z","ATL","NYC"));
        trips.put("ABC122",new Trip("ABC122","123122","B","z","ATL","NYC"));
        trips.put("ABC123",new Trip("ABC123","123123","C","z","ATL","NYC"));
        trips.put("ABC124",new Trip("ABC124","123124","D","z","ATL","NYC"));
        trips.put("ABC125",new Trip("ABC125","123125","E","z","ATL","NYC"));
    };

    @RequestMapping("/getTripByConfirmationNumber/{confirmationNumber}")
    public Trip getTripByConfirmationNumber(@PathVariable String confirmationNumber) {
        return trips.get(confirmationNumber);
    }

    @RequestMapping("/getTrips")
    public List<Trip> getTrips() {
        return new ArrayList<Trip>(trips.values());
    }
}

