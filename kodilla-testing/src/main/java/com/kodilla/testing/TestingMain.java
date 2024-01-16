package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        /*SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        } */

        Calculator calculator = new Calculator();

        if(calculator.add(5,2) == 7) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error");
        }

        if(calculator.substarct(5,2) == 3) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error");
        }
    }
}