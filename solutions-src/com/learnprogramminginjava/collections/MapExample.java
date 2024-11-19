package com.learnprogramminginjava.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {



    public static void main(String[] args) {

        Map<String, SafeCollection.Apple> fruitInventory = new HashMap<>();

        fruitInventory.put("A100", new SafeCollection.Apple());
        fruitInventory.put("A200", new SafeCollection.Apple());
        fruitInventory.put("A300", new SafeCollection.GrannyApple());

        SafeCollection.Apple apple = fruitInventory.get("A100");
        apple.slice();
    }

}
