package com.kodilla.good.patterns.challenges.productOrderService;

public class Product {
    private String  id;
    private String name;
    private double weight0;
    private double price;
    private String category;


    public Product(String id, String name, double weight0, double price, String category) {
        this.id = id;
        this.name = name;
        this.weight0 = weight0;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight0() {
        return weight0;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
