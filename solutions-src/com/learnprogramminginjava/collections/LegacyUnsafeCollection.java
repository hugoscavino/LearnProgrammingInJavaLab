package com.learnprogramminginjava.collections;

import java.util.ArrayList;

public class LegacyUnsafeCollection {
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

    public static void main(String[] args) {
        // DO NOT DO THIS ANYMORE!
        // WARNING: RAW USE OF LIST
        ArrayList list = new ArrayList();

        list.add(new Apple());
        list.add(new Apple());
        list.add(new Orange()); // YIKES!
        list.add(new Apple());

        for (Object o : list) {
            Apple apple = (Apple)o; /// OH NO!!!!!
            apple.slice();
        }

    }
}
