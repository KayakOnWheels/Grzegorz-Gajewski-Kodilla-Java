package com.kodilla.good.patterns.challenges.productOrderService.messageServices;

import com.kodilla.good.patterns.challenges.productOrderService.Order;
import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public class MessageGenerator {

    public static String generateConfirmation(User user) {
        Order order = user.getOrders().get(user.getOrders().size()-1);

        return "This is confirmation of order "
                + order.getId()
                + "for "
                + user.getFirstName()
                + ". Value of order is: "
                + order.getTotalPrice();
    }
}
