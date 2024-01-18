package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();

        if (numbers.size() == 0) {
            list.add(-1);
        } else {
            for (Integer i : numbers) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
