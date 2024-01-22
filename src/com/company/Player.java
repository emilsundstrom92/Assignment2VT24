package com.company;

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

    public void greeting(int number){
        System.out.println("Player " + number + ": " + name);
    }
}
