package com.company;

import java.util.Scanner;

public class Nm {
    public static void main(String[] arg) {

        GameLogic g = new GameLogic();
        int numberOfMatches = Integer.parseInt(arg[0]);
        g.setNumberOfMatches(numberOfMatches);
        Human h = new Human(numberOfMatches,"Human");
        Computer c = new Computer(numberOfMatches,"Computer");


        boolean gameOver = false;
        g.greeting();
        h.greeting(1);
        c.greeting(2);
        while (!gameOver){
            if (g.getNumberOfMatches() != 1){
                g.printMatches();

                int answer = h.move();
                while (!g.illegalMove(answer)){
                    System.out.println("Illegal move");
                    answer = h.move();
                }
                g.setNumberOfMatches(g.numberOfMatches- answer);
                System.out.println("Player picked " + answer + " matches");
                g.printMatches();

                if(g.getNumberOfMatches() != 1){
                    int computerAnswer = c.move();
                    g.setNumberOfMatches(g.numberOfMatches- computerAnswer);
                    System.out.println("Computer picked " + computerAnswer + " matches");
                } else {
                    gameOver = true;
                }
            }
            else{
                gameOver = true;
            }

        }


    }
}
/*
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user a math question
        System.out.print("What is 2 + 2? ");

        // Read the user's answer
        int userAnswer = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Check if the answer is correct
        if (userAnswer == 4) {
            System.out.println("Congratulations! That's correct.");
        } else {
            System.out.println("Sorry, the correct answer is 4.");
        }
 */