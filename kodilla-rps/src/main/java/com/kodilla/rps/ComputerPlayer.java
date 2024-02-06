package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

    public String getCurrentMove() {
        Random rnd = new Random();
        return String.valueOf(rnd.nextInt(2)+1);
    }
}