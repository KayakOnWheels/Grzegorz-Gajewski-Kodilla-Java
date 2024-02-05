package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Country {

    private String country;
    private BigDecimal population;

    public Country(String country, BigDecimal population) {
        this.country = country;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", population=" + population +
                '}';
    }

    BigDecimal getPeopleQuantity() {
        return population;
    }
}
