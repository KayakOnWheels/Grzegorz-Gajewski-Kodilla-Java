package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

    public double power(int a, int n) throws ArithmeticException {
        int result = 0;
        if(n == 0) {
            return 1;
        } else if(n == 1) {
            return a;
        } else {
            for(int i = 0; i < n; i++) {
                result = a * a;
            }
            return result;
        }

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 0);
        }
        catch(ArithmeticException e) {
            System.out.println("Can;t divide by 0");
        } finally {
            System.out.println("Something happend... or not");
        }

        System.out.println(result);

        System.out.println(firstChallenge.power(18,1));
    }
}