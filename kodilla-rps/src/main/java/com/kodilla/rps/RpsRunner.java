package com.kodilla.rps;

import static com.kodilla.rps.GameRules.setNumberOfRounds;
import static com.kodilla.rps.GameRules.whoWins;
import static com.kodilla.rps.IOController.*;

public class RpsRunner {

    protected static HumanPlayer player1;
    protected static ComputerPlayer player2;
    protected static int currentRound;

    public void startGame() {
        currentRound = 0;

        System.out.print("What's your name? ");
        player1 = new HumanPlayer(IOController.getInput());
        player2 = new ComputerPlayer("NPC");

        System.out.print("How many rounds do you want to play? ");
        setNumberOfRounds(Integer.parseInt(getInput()));

        showControlGuide();
        processGame();
    }

    public void processGame() {

        while (GameRules.getNumberOfRounds() > currentRound) {

            System.out.print("Your move ");
            String p1Move = player1.getCurrentMove();

            if(p1Move.equals("m")) {
                enterMenu();
            } else {
                currentRound++;

                System.out.println(rpsInputParser(p1Move));

                System.out.println("Opponent's move");
                String p2Move = player2.getCurrentMove();
                System.out.println(rpsInputParser(p2Move));
                System.out.println("------");

                whoWins(p1Move, p2Move);

            }
        }
        finishGame();
    }


    public void enterMenu() {
        showMenu();
        String input = getInput();

/*        if(input.equals("n")) {
            confirmNewGame();

            if(makeChoice()) {
                startGame();
            } else {
                enterMenu();
            }
        } else if(input.equals("x")) {
            endGame();
        } else if(input.equals("r")) {
            if(player1 == null) {
                System.out.println("No game to resume!");
                showMenu();
            } else {
                processGame();
            }
        } else if(input.equals("s")) {
            showStatistics();
        } else if(input.equals("h")) {
            showControlGuide();
        } else {
            enterMenu();
        }
    }*/

        switch (input) {
            case "n" -> {
                confirmNewGame();
                if (makeChoice()) {
                    startGame();
                } else {
                    enterMenu();
                }
            }
            case "x" -> endGame();
            case "r" -> {
                if (player1 == null) {
                    System.out.println("No game to resume!");
                    enterMenu();
                } else {
                    processGame();
                }
            }
            case "s" -> {
                showStatistics();
                enterMenu();
            }
            case "h" -> {
                showControlGuide();
                enterMenu();
            }
            default -> enterMenu();
        }
    }

    public void endGame() {
        confirmEndGame();
        if(makeChoice()) {
            System.exit(0);
        } else {
            enterMenu();
        }
    }


}