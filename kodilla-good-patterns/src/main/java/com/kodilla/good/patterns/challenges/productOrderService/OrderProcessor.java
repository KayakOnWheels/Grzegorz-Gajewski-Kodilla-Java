package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.users.User;

import java.util.List;

public class OrderProcessor {

    public static void process(User user, List<Product> products) {
        Order order = new Order(products);
        user.addOrder(order);
    }
}
