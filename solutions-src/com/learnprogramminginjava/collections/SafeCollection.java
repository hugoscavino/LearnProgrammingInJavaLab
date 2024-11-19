package com.learnprogramminginjava.collections;

import java.util.ArrayList;
import java.util.List;

public class SafeCollection {
    public static class Apple{
        public Apple(){
            System.out.println("I am an Apple");
        }
        public void slice(){
            System.out.println("Apple Slice");
        }

    }
    public static class Orange{
        public Orange(){
            System.out.println("I am an Orange");
        }
        void peal(){
            System.out.println("Peal Me");
        }
    }

    public static class GrannyApple extends Apple{
        public GrannyApple(){
            System.out.println("I am an Granny Apple");
        }
    }

    public static void main(String[] args) {
        // DO THIS INSTEAD
        // List ONLY accepts Apple Type
        List<Apple> list = new ArrayList<>();

        list.add(new Apple());
        list.add(new Apple());
        list.add(new GrannyApple());

        //list.add(new Orange()); // Compile Time!
        list.add(new Apple());

        for (Apple apple : list) {
            apple.slice(); // No Need to case object
        }

    }
}
