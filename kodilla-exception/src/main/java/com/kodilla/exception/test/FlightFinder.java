package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightFinder {

    private Map<String, Boolean> routeAvailable;

    public FlightFinder() {
        routeAvailable = new HashMap<>();
        routeAvailable.put("Chopin", true);
        routeAvailable.put("Radom", false);
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Boolean b = routeAvailable.get(flight.getArrivalAirport());
        if(b!= null) {
            return b;
        } else {
            throw new RouteNotFoundException("Value of given key is null");
        }
    }

}
