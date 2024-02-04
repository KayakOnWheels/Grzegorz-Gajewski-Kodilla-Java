package com.kodilla.exception.test;

public class ExceptionHandling {

    public void  tryMe(double a, double b) {
        SecondChallenge s = new SecondChallenge();

        try {
            s.probablyIWillThrowException(a, b);
        }
        catch (Exception e) {
            System.out.println("Error: x >= 2 || x < 1 || y == 1.5");
        }
        finally {
            System.out.println("There was a try... But was it successful?");
        }
    }
}
