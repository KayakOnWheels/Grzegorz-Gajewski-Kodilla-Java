package fly2sky;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private static final List<Route> routesDb = DataGenerator.getRoutesDb();
    private static final List<Airport> airports = DataGenerator.createAirports();

    public static List<Route> listDirectRoutesFrom(Airport originAirport) {
        return routesDb.stream()
                .filter(x -> x.originAirport().equals(originAirport))
                .toList();
    }

    public static List<Route> listDirectRoutesTo(Airport destinationAirport) {
        return routesDb.stream()
                .filter(x -> x.destinationAirport().equals(destinationAirport))
                .toList();
    }

    public static List<Route> listDirectRoutesFromTo(Airport originAirport, Airport destinationAirport) {
        if(originAirport.equals(destinationAirport)) {
            return routesDb.stream()
                    .filter(x -> x.originAirport().equals(destinationAirport)
                    && x.destinationAirport().equals(destinationAirport))
                    .toList();
        }
        return null;
    }

    public static List<List<Route>> listIndirectRoutesFromTo (Airport originAirport, Airport destinationAirport) {
        List<Route> directRoutes = new ArrayList<>();
        List<List<Route>> indirectRoutes = new ArrayList<>();

        directRoutes.addAll(listDirectRoutesFrom(originAirport));
        directRoutes.addAll(listDirectRoutesTo(destinationAirport));

        for(Route r1 : directRoutes) {
            for(Route r2 : directRoutes) {
                if(r1.destinationAirport().equals(r2.originAirport())) {
                    indirectRoutes.add(List.of(r1,r2));
                }
            }
        }
        return indirectRoutes;
    }

    public static Airport findAirportByIdentifier(String airportIdentifier) {
        return airports.stream().filter(x -> x.identifier().equals(airportIdentifier)).findFirst().orElse(null);
    }
}
