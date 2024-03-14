package fly2sky;

import static fly2sky.FlightFinder.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(listDirectRoutesFrom(findAirportByIdentifier("WAW")));

        IoController.listIndirectRoutes(listIndirectRoutesFromTo(findAirportByIdentifier("WAW"),findAirportByIdentifier( "GDA")));
    }
}
