package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;


    @Test
    public void testCalculations() {
        //Given
        //When
        double rsltAdd = calculator.add(2,2);
        double rsltSub = calculator.sub(2,2);
        double rsltMul = calculator.mul(2,2);
        double rsltDiv = calculator.div(2,2);

        //Then
        Assertions.assertEquals(4, rsltAdd);
        Assertions.assertEquals(0, rsltSub);
        Assertions.assertEquals(4, rsltMul);
        Assertions.assertEquals(1, rsltDiv);

    }
}
