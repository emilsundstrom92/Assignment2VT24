package com.company;

public class Computer extends Player{




    public Computer(int sticks, String name) {
        super(sticks, name);
    }

    @Override
    public int move(){
        int stickRemoval = 1;
        return stickRemoval;
    }


}
