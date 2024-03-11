package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.users.IndividualUser;
import com.kodilla.good.patterns.challenges.productOrderService.users.User;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderService {

    public static void main(String[] args) {

        User user = new IndividualUser("Adamo", "Adam", "Adamowicz", "mail@mail.pl", "123456789", "Adamowska 15, Adamow");
        List<Product> productsToOrder = List.of(
                new Product("1243", "Wloczka", 0.5, 10.0, "Szycie"),
                new Product("6345", "Wycieraczki", 1.5, 100.0, "Samochody"));

        OrderProcessor.process(user, productsToOrder);
        CheckoutProcessor.process(user, "Wysocka 3, Szczebrzeszyn", "InPost");
    }
}
