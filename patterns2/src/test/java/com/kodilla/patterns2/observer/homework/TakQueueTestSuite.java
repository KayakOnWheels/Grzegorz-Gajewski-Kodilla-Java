package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class TakQueueTestSuite {

    @Test
    void test() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("TaskQueue1");
        TaskQueue taskQueue2 = new TaskQueue("TaskQueue2");
        TaskQueue taskQueue3 = new TaskQueue("TaskQueue3");

        Mentor mentor1 = new Mentor("m1");
        Mentor mentor2 = new Mentor("m2");
        Mentor mentor3 = new Mentor("m3");

        taskQueue1.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor2);
        taskQueue3.registerObserver(mentor3);

        //When
        taskQueue1.addTask("t1");
        taskQueue1.addTask("t2");
        taskQueue2.addTask("t3");
        taskQueue2.addTask("t4");
        taskQueue2.addTask("t5");
        taskQueue2.addTask("t6");
        taskQueue3.addTask("t7");

        //Then
        assertEquals(2, mentor1.getTaskAssigned());
        assertEquals(4, mentor2.getTaskAssigned());
        assertEquals(1, mentor3.getTaskAssigned());

    }
}
