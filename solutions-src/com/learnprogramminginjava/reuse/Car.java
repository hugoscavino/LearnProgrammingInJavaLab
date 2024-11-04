package com.learnprogramminginjava.reuse;

import java.util.Arrays;

public class Car {

    private final Engine engine;
    private final Tire[] tires; // Array of Tire objects

    /**
     * We prefer constructor initialization (DI)
     * @param engine The Car's engine
     * @param tires  The Car's tires
     */
    public Car(Engine engine, Tire[] tires) {
        this.engine = engine;
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire[] getTires() {
        return tires;
    }

    public static void main(String[] args) {

            Engine engine = new Engine("EightCylinder");
            Tire[] tires = new Tire[4]; // Cars typically have 4 tires
            for (int i = 0; i < tires.length; i++) {
                tires[i] = new Tire(16);
            }
            Car car = new Car(engine, tires);
            System.out.println(car);
        }


    @Override
    public String toString() {
        return "Car [" +
                    "[" + engine +
                    "], Tire Set=" + Arrays.toString(tires) +
                ']';
    }
}
