package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask() {
        System.out.println("Driving to " + where + " by " + using);
        isExecuted = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
