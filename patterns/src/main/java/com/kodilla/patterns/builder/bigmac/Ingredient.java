package com.kodilla.patterns.builder.bigmac;

public class Ingredient {
    public static final String LETTUCE = "Lettuce";
    public static final String ONION = "Onion";
    public static final String BEACON = "Beacon";
    public static final String CUCUMBER = "Cucumber";
    public final String type;

    public Ingredient(String ingredient) {
        if(ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BEACON) || ingredient.equals(CUCUMBER)) {
            this.type = ingredient;
        } else {
            throw new IllegalStateException("No such ingredient in offer!");
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
