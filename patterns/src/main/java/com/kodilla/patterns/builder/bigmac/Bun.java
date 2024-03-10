package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String SEZAM = "Sezam";
    public static final String PLAIN = "Plain";
    private final String type;

    public Bun(String type) {
        if(type.equals(SEZAM) || type.equals(PLAIN)) {
            this.type = type;
        } else {
            throw new IllegalStateException("No such bun in offer!");
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
