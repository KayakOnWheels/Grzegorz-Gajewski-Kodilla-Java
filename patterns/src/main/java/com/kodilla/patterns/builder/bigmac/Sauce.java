package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "Standard";
    public static final String THOUSAND_ISLANDS = "1000's Islands";
    public static final String BARBEQUE= "Barbeque";
    private final String type;

    public Sauce(String type) {
        if(type.equals(STANDARD) || type.equals(THOUSAND_ISLANDS) || type.equals(BARBEQUE)) {
            this.type = type;
        } else {
            throw new IllegalStateException("No such sauce in offer!");
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
