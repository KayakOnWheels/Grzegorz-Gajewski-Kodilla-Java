package com.kodilla.good.patterns.challenges;


public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                //.map(s -> s + "!")
                .forEach(s -> System.out.print(s + "!"));

        System.out.println();

        System.out.println(Factorial.calcFactorial(3));
        System.out.println(Factorial.calcFactorial(4));
        System.out.println(Factorial.calcFactorial(0));
    }
}