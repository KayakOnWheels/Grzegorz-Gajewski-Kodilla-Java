package com.kodilla.good.patterns.challenges;

public class Factorial {

    public static int calcFactorial(int n) {
        int factorial = 1;
        for(int i = 1; i<=n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
