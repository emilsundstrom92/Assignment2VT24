/*import com.company.Computer;
import com.company.GameLogic;
import com.company.Human;

import java.util.Scanner;

public class Nm {
    public static void main(String[] arg) {

        GameLogic g = new GameLogic();
        int numberOfMatches = Integer.parseInt(arg[0]);
        g.setNumberOfMatches(numberOfMatches);
        Human h = new Human(numberOfMatches,"Player 1");
        Computer c = new Computer(numberOfMatches,"Computer 1");


        boolean gameOver = false;
        g.greeting();
        while (!gameOver){
            if (g.getNumberOfMatches() != 1){
                g.printMatches();
                do{
                    h.move();
                }
                g.setNumberOfMatches(numberOfMatches- h.move());
                g.setNumberOfMatches(numberOfMatches- c.move());
            }
            else{
                gameOver = true;
            }

        }


    }
}



public class GameLogic {

    public int numberOfMatches;
    public int playerTurn;

    /*
    public static void main (String[] arg) {
        int numberOfMatches = Integer.parseInt(arg[0]);
    }

     */
/*

import java.util.Scanner;

public GameLogic() {
    }

    public void greeting(){
        System.out.println("Welcome to Nm");
    }

    public void printMatches(){
        System.out.println("Remaining matches: " + this.numberOfMatches);
    }

    public int getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(int numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public void rules(){

    }

}


public class Player {

    public int sticks;
    public String name;

    public Player() {
    }


    public Player(int sticks, String name) {
        this.sticks = sticks;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int move(){
        return sticks;
    }

    public int getSticks() {
        return sticks;
    }

    public void setSticks(int sticks) {
        this.sticks = sticks;
    }

    public void greeting(){
        System.out.println("Welcome player " + name);
    }
}



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

public class Computer extends Player {




    public Computer(int sticks, String name) {
        super(sticks, name);
    }

    @Override
    public int move(){
        sticks = sticks-1;
        return sticks;
    }


}
*/