package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private double sideA;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square square)) return false;
        return Double.compare(sideA, square.sideA) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA);
    }

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return sideA*sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}
