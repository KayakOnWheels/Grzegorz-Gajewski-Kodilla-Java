package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Task waiting for execution";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        taskListDao.save(taskList);

        //When
        List<TaskList> toDoTasks = taskListDao.findByListName("ToDo");

        //Then
        assertEquals("ToDo", toDoTasks.get(0).getListName());

        //CleanUp
        int id = toDoTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
