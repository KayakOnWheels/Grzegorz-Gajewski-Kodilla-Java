package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public class Checkout {

    private User user;
    private String shippingAddress;
    private String shippingMethod;

    public Checkout(User user, String shippingAddress, String shippingMethod) {
        this.user = user;
        this.shippingAddress = shippingAddress;
        this.shippingMethod = shippingMethod;
    }

    public User getUser() {
        return user;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }
}
