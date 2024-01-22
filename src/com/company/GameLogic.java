package com.company;

public class GameLogic {

    public int numberOfMatches;
    public int playerTurn;

    /*
    public static void main (String[] arg) {
        int numberOfMatches = Integer.parseInt(arg[0]);
    }

     */

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

    public boolean illegalMove(int move){
        if(move > this.numberOfMatches/2){
            return false;
        }
        else{
            return true;
        }
    }


}



