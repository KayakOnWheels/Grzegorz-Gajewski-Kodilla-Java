package com.kodilla.rps;

public class HumanPlayer extends Player{

    public HumanPlayer(String name) {
        super(name);
    }
    public String getCurrentMove() {
        return IOController.getInput();
    }
}
