package com.learnprogramminginjava.interfaces;

public class Person implements Speakable{

    @Override
    public void speak() {
        System.out.println("Hello World!");
    }
}

