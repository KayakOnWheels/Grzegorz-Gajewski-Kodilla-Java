package com.kodilla.stream.world;

import java.math.*;
import java.util.*;

public class World {
    private Set<Continent> continentList = new HashSet<>();

    public World(Set<Continent> continentList) {

        this.continentList = continentList;
    }

    public Set<Continent> getContinentList() {
        return continentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof World world)) return false;
        return Objects.equals(continentList, world.continentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentList);
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountriesOnContinent().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
