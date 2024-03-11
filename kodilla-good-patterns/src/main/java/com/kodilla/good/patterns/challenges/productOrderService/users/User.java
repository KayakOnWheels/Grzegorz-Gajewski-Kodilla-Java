package com.kodilla.good.patterns.challenges.productOrderService.users;

import com.kodilla.good.patterns.challenges.productOrderService.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String id;
    private List<Order> orders;

    public User(String username, String firstName, String lastName, String email, String phoneNumber, String id) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.orders = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}
