package fly2sky;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static List<Airport> createAirports() {

        return List.of(
        new Airport("Warszawa-Chopin", "Warszawa", "WAW"),
        new Airport("Kraków-Balice", "Krakow", "KRK"),
        new Airport("Gdansk-Walesa", "Gdansk", "GDA"),
        new Airport("Katowice-International", "Katowice", "KTW"),
        new Airport("Wroclaw-Copernicus", "Wroclaw", "WRO")
        );
    }

    public static List<Route> getRoutesDb() {
        List<Airport> airports = createAirports();
        List<Route> routes = new ArrayList<>();

        for (Airport origin : airports) {
            for (Airport destination : airports) {
                if (!origin.equals(destination)) {
                    routes.add(new Route(origin, destination));
                }
            }
        }
        return routes;
    }
}
