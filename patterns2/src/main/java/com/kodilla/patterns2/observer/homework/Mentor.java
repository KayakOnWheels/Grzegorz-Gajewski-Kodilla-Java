package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String name;
    private int tasksAssigned;

    public Mentor(String name) {
        this.name = name;
        tasksAssigned = 0;
    }

    public String getName() {
        return name;
    }

    public int getTaskAssigned() {
        return tasksAssigned;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        tasksAssigned++;
        System.out.println("Task "  + taskQueue.getTaskList().get(taskQueue.getTaskList().size()-1) + " assigned to you: " + name);
    }
}
