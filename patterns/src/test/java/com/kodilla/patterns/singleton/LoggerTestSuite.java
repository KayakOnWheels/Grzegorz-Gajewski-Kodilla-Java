package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        Logger logger = Logger.LOGGER;

        logger.log("First Logged Log");
        logger.log("Second Logged Log");
        logger.log("Third Logged Log");

        //When
        String rslt = logger.getLastLog();

        //Then
        Assertions.assertEquals("Third Logged Log", rslt);
    }
}
