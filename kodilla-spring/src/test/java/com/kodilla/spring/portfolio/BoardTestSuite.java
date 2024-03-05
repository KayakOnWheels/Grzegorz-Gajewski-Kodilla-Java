package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().getTasks().add("zad1");
        board.getToDoList().getTasks().add("zad2");
        board.getInProgressList().getTasks().add("zad3");


        //Then

        Assertions.assertEquals("zad1", board.getDoneList().getTasks().get(0));
        Assertions.assertEquals("zad2", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("zad3", board.getInProgressList().getTasks().get(0));
    }
}
