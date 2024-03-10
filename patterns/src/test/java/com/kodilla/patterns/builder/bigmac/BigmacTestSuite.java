package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sezam")
                .burgers(2)
                .sauce("Standard")
                .ingredients("Lettuce")
                .ingredients("Onion")
                .build();

        System.out.println(bigmac.toString());

        //When
        String bun = bigmac.getBun().toString();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce().toString();
        int ingredients = bigmac.getIngredients().size();

        //Then
        assertEquals("Sezam", bun);
        assertEquals(2, burgers);
        assertEquals("Standard", sauce);
        assertEquals(2, ingredients);

    }
}
