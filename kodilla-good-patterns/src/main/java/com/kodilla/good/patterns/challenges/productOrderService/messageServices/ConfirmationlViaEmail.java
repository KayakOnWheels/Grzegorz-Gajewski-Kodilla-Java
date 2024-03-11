package com.kodilla.good.patterns.challenges.productOrderService.messageServices;

import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public class ConfirmationlViaEmail implements MessageSender {

    @Override
    public void sendMessage(User user) {
        System.out.println("Sending mail to " + user.getEmail() + ". " + MessageGenerator.generateConfirmation(user));
    }
}
