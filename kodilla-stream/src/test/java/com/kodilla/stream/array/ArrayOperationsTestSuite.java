package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] intArray = {2, 3, 5, 9};


        //When
        double average = ArrayOperations.getAverage(intArray);

        //Then
        assertEquals(4.75, average);
    }
}