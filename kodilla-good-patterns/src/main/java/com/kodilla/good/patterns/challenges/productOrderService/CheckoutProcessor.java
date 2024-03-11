package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.messageServices.ConfirmationViaSms;
import com.kodilla.good.patterns.challenges.productOrderService.messageServices.ConfirmationlViaEmail;
import com.kodilla.good.patterns.challenges.productOrderService.users.User;

public class CheckoutProcessor {

    public static void process(User user,String shippingAddress, String shippingMethod) {
        Checkout checkout = new Checkout(user, shippingAddress, shippingMethod);
        if(!CheckoutValidator.isCheckoutDataValid(checkout)) {
            System.out.println("ERRRROR");
        } else {
            System.out.println("You bought it!");
            user.getOrders().get(user.getOrders().size()-1).setPending(false);

            if(user.getEmail() != null) {
                new ConfirmationlViaEmail().sendMessage(user);
            }
            if(user.getPhoneNumber() != null) {
                new ConfirmationViaSms().sendMessage(user);
            }
        }
    }
}
