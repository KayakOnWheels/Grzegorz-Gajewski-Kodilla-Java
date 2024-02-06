package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.player1;
import static com.kodilla.rps.RpsRunner.player2;

public class GameRules {

    final static private int rules[][] = {
            { 0,-1, 1},
            { 1, 0,-1},
            {-1, 1, 0}
    };
    private static int numberOfRounds;


    public static void whoWins(String player1Move, String player2Move) {
        int score = rules[Integer.parseInt(player1Move)-1][Integer.parseInt(player2Move)-1];
        if(score == 1) {
            player1.addPoint();
            System.out.println("Point for player 1!");
        } else if(score == -1) {
            player2.addPoint();
            System.out.println("Point for player 2!");
        } else {
            System.out.println("Draw!");
        }
        System.out.println();
    }


    public static void setNumberOfRounds(int x) {
        numberOfRounds = x; //dlaczego nie mogę tu użyć this?
    }

    public static int getNumberOfRounds() {
        return numberOfRounds;
    }
}
