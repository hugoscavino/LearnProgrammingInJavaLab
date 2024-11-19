package com.learnprogramminginjava.interfaces;

public interface Speakable {

    // No need to be public
    boolean isVeryLoud = true;

    int volumeLevel = 100;

    static void calculateDecibels(){
        System.out.println("Calculate the volume in decibels");
    }

    // No need to add public nor abstract
    void speak();

    // note the `default` key word and implementation!
    default void mute(){
        System.out.println("mute the speaker!");
    }
}
