package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.List;

public class Order {

    private String id;
    private List<Product> products;
    private double totalPrice;
    private boolean pending;

    public Order(List<Product> products) {
        this.id = "3231das";
        this.products = products;
        this.totalPrice = calculateTotalPrice();
        this.pending = true;
    }

    public double calculateTotalPrice() {
        double rslt = 0;
        for(Product product : products) {
            rslt += product.getPrice();
        }
        return rslt;
    }

    public String getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }
}
