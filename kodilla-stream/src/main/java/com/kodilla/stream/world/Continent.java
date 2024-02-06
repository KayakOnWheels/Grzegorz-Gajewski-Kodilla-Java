package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class Continent {

    private Set<Country>  countriesOnContinent= new HashSet<>();

    public Continent(Set<Country> countries) {
        this.countriesOnContinent = countries;
    }

    public Set<Country> getCountriesOnContinent() {
        return countriesOnContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent continent)) return false;
        return Objects.equals(countriesOnContinent, continent.countriesOnContinent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countriesOnContinent);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countriesOnContinent=" + countriesOnContinent +
                '}';
    }
}
