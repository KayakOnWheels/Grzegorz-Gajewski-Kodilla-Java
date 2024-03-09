package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch(taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping Task", "milk", 1);
            case PAINTING -> new PaintingTask("Painting Task", "magenta", "bedroom");
            case DRIVING -> new DrivingTask("Driving Task", "Honolulu", "Beater");
            default -> null;
        };
    }

}
