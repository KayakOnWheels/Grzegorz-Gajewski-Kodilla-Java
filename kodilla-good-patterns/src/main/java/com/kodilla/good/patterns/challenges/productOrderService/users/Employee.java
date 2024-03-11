package com.kodilla.good.patterns.challenges.productOrderService.users;

import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public class Employee extends User {
    private String role;

    public Employee(String username, String firstName, String lastName, String email, String phoneNumber, String id, String role) {
        super(username, firstName, lastName, email, phoneNumber, id);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
