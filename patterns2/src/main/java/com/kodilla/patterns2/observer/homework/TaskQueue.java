package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{

    private final List<Observer> observers;
    private List<String> taskList;
    private String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        taskList = new ArrayList<>();
        this.name = name;
    }


    public void addTask(String task) {
        taskList.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
