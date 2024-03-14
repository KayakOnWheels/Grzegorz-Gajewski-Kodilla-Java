package fly2sky;

import java.util.Objects;

public record Route(Airport originAirport, Airport destinationAirport) {

    @Override
    public String toString() {
        return originAirport.identifier() + " --> " + destinationAirport.identifier();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Route route)) return false;
        return Objects.equals(originAirport, route.originAirport) && Objects.equals(destinationAirport, route.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originAirport, destinationAirport);
    }
}
