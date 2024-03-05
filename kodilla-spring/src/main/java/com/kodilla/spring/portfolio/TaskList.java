package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public  List<String> getTasks() {
        return tasks;
    }
}
