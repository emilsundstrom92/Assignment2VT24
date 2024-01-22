package com.company;
import java.util.Scanner;

public class Human extends Player {

    Scanner scanner = new Scanner(System.in);


    public Human(int sticks, String name) {
        super(sticks, name);
    }

    @Override
    public int move() {
        System.out.println("Please pick a number");
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }
}
