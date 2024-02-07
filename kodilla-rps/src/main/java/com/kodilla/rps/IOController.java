package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.RpsRunner.*;

public class IOController {

    private static Scanner scanner = new Scanner(System.in);

    public static String getInput() {
        return String.valueOf(scanner.nextLine());
    }

        public static String rpsInputParser(String i) {
        Scanner scanner = new Scanner(System.in);
        return switch (i) {
            case "1" -> "-rock-";
            case "2" -> "-paper-";
            case "3" -> "-scissors-";
            case "4" -> "-spock-";
            case "5" -> "-lizard-";
            default -> "";
        };
    }

    public static void showMenu() {
        System.out.println("""
                ---------Menu----------
                n - start new game
                x - end game
                r - resume
                s - statistics
                h - help
                -----------------------
                """);
    }
    public static void showControlGuide() {
        System.out.println("""
                -----------------------
                1 - rock
                2 - paper
                3 - scissors
                4 - spock
                5 - lizard
                m - show menu
                -----------------------
                """);
    }

    public static void showStatistics() {
        System.out.println("------Statistics-------");
        if (player1 == null) {
            System.out.println("Nothing to show\n");
        } else {
            System.out.println(player1.getName() + " " + player1.getPointsInRound() + " - " +
                    player2.getPointsInRound() + " " + player2.getName());
        }


    }

    public static void confirmNewGame() {
        System.out.println("""
                Are you sure you want start new game?
                y - yes
                n - cancel
                """);
    }

    public static void confirmEndGame() {
        System.out.println("""
                Are you sure you want end game?
                y - yes
                n - cancel
                """);
    }

    public static boolean makeChoice() {
        String input = getInput();

        if(input.equals("y")) {
            return true;
        } else if(input.equals("n")) {
            return false;
        }
        else return false;
    }

    public static void finishGame() {
        System.out.println("************");
        System.out.println("Game finished in " + (currentRound) + " rounds");
        System.out.println(player1.getName() + " " + player1.getPointsInRound() + " - " +
                player2.getPointsInRound() + " " + player2.getName());
    }




}
