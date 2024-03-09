package com.kodilla.patterns.factory.tasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    private TaskFactory taskFactory = new TaskFactory();


    @Test
    public void testFactoryShoppingTask() {
        //Given
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();;

        //Then
        assertEquals("Shopping Task", shoppingTask.getTaskName());
        assertTrue( shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();

        //Then
        assertEquals("Painting Task", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();

        //Then
        assertEquals("Driving Task", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
}
