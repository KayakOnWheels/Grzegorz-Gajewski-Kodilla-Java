package com.kodilla.good.patterns.challenges.productOrderService.messageServices;

import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public class ConfirmationViaSms implements MessageSender {

    @Override
    public void sendMessage(User user) {
        System.out.println("Sending sms to " + user.getPhoneNumber() + ". " + MessageGenerator.generateConfirmation(user));
    }
}
