package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Set<Country> countriesEU = new HashSet<>();
        countriesEU.add(new Country("Poland", new BigDecimal("24342342324")));
        countriesEU.add(new Country("Netherlands", new BigDecimal("4535345")));

        Set<Country> countriesNA = new HashSet<>();
        countriesNA.add(new Country("USA", new BigDecimal("242344342342324")));
        countriesNA.add(new Country("Canada", new BigDecimal("2454342342324")));

        Continent Europe = new Continent(countriesEU);
        Continent NorthAmerica = new Continent(countriesNA);

        Set<Continent> continentSet = new HashSet<>();
        continentSet.add(Europe);
        continentSet.add(NorthAmerica);

        World world = new World(continentSet);


        //When
        BigDecimal worldPopulation = BigDecimal.ZERO;
        worldPopulation = world.getPeopleQuantity();
        //System.out.println(countriesEU);

        //Then
        BigDecimal expectedPopulation = new BigDecimal("244823031562317");
        assertEquals(expectedPopulation, worldPopulation);
    }
}