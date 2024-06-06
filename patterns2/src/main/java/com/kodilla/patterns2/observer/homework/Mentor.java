package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Task "  + taskQueue.getTaskList().get(taskQueue.getTaskList().size()-1) + " assigned to you: " + name);
    }
}
