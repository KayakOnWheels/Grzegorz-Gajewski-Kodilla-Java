package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PizzaOrderTestSuite {

    @Test
    public void shouldGetCostAndDescriptionOfPizzaWithAllExtras() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PepperoniDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new TomatoDecorator(theOrder);

        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();

        //Then
        assertEquals(new BigDecimal("21.00"), theCost);
        assertEquals("Pizza ingredients: tomato sauce, cheese, pepperoni, extra cheese, tomato, ", description);
    }

    @Test
    public void shouldGetCostAndDescriptionOfBasicPizza() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();

        //Then
        assertEquals(new BigDecimal("15.00"), theCost);
        assertEquals("Pizza ingredients: tomato sauce, cheese, ", description);
    }
}
