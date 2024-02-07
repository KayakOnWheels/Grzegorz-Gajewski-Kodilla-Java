package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {

        Flight myFlight = new Flight("radom", "Chopfin");

        FlightFinder flightFinder = new FlightFinder();

        try {
            boolean b = flightFinder.findFlight(myFlight);
            System.out.println("Flight found. Route available? " + b);
        }
        catch(Exception e) {
            System.out.println("Airport doesn't exist");
        }
    }
}
