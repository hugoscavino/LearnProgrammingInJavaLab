package com.learnprogramminginjava.polymorphism;

import com.learnprogramminginjava.reuse.Engine;

public class Vehicle implements Startable{

    protected int numWheels = 4;

    private final Engine engine = new Engine("Gas");

    public Vehicle(){

        System.out.println("Vehicle Constructor");
        System.out.println("I Have " + numWheels + " Wheels");
    }

    @Override
    public void start(){
        System.out.println("Vehicle started");
    }

    public Engine getEngine() {
        return engine;
    }
    public int getNumWheels() {
        return numWheels;
    }
}


