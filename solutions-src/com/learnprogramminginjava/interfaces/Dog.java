package com.learnprogramminginjava.interfaces;

public class Dog extends Mammal implements Speakable {

    // Note the annotation for @Override
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    void giveMilk() {
        System.out.println("Mother's give milk");
    }
}
