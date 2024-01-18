package com.kodilla.testing.collection;

import java.util.*;

import org.junit.jupiter.api.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {


    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("given empty list, method exterminate() should return list with only one element with value of -1")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator o = new OddNumbersExterminator();
        List<Integer> inputList = List.of();
        List<Integer> exceptedOutcomeList = List.of(-1);
        List<Integer> outcomeList;// = new ArrayList<>();

        //When
        //outcomeList = o.exterminate(List.of(1,2,3,4,10,15,19,22,23));
        outcomeList = o.exterminate(inputList);

        //Then
        Assertions.assertEquals(exceptedOutcomeList, outcomeList);
    }


    @DisplayName("given list with odd and even numbers, method exterminate() should return list of even numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        //Integer[] inputList= {1,2,3,4,10,15,19,22,23};                            //Extra assignment
        OddNumbersExterminator o = new OddNumbersExterminator();
        List<Integer> exceptedOutcomeList = List.of(2,4,10,22);

        //When
        List<Integer> outcomeList = o.exterminate(List.of(1,2,3,4,10,15,19,22,23));
        //List<Integer> outcomeList = o.exterminate(Arrays.asList(inputList));      //Extra assignment

        //Then
        Assertions.assertEquals(exceptedOutcomeList, outcomeList);
    }
}
