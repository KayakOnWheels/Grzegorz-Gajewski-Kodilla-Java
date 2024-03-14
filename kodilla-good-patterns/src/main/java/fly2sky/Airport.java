package fly2sky;

import java.util.Objects;

public record Airport(String name, String location, String identifier) {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport airport)) return false;
        return Objects.equals(name, airport.name) && Objects.equals(location, airport.location) && Objects.equals(identifier, airport.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, identifier);
    }
}
