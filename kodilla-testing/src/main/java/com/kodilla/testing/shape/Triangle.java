package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double sideA;
    private double height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(height, triangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, height);
    }

    public Triangle(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", height=" + height +
                '}';
    }

    @Override
    public double getField() {
        return (sideA*height)/2;
    }
}
