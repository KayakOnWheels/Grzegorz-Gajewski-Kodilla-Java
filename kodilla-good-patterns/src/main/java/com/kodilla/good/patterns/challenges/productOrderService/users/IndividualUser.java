package com.kodilla.good.patterns.challenges.productOrderService.users;

import com.kodilla.good.patterns.challenges.productOrderService.Order;

import java.util.List;

public class IndividualUser extends User {

    private List<Order> orders;

    public IndividualUser(String username, String firstName, String lastName, String email, String phoneNumber, String address) {
        super(username, firstName, lastName, email, phoneNumber, address);
    }


}
