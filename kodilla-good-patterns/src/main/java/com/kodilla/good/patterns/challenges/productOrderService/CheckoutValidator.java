package com.kodilla.good.patterns.challenges.productOrderService;


public class CheckoutValidator {

    public static boolean isCheckoutDataValid(Checkout checkout) {
        if(checkout.getShippingAddress() != null && checkout.getShippingMethod() != null) {
            return true;
        } else {
            return false;
        }
    }
}
