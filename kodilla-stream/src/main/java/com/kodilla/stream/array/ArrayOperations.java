package com.kodilla.stream.array;

import java.util.stream.*;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

        double n;
        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        n = IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .average()
                .orElse(0);

        return n;
    };
}
