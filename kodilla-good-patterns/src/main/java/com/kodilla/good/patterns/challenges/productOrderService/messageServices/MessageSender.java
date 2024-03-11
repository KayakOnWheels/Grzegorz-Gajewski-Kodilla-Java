package com.kodilla.good.patterns.challenges.productOrderService.messageServices;

import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public interface MessageSender {

    public void sendMessage(User object);
}
