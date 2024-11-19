package com.learnprogramminginjava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGroups {
    public static void main(String[] args) {

        Collection<SafeCollection.Apple> apples = new ArrayList<>(
                Arrays.asList(
                        new SafeCollection.Apple(),
                        new SafeCollection.Apple(),
                        new SafeCollection.Apple(),
                        new SafeCollection.GrannyApple()));
        System.out.println("Apples in collection " + apples.size());

        SafeCollection.Apple[] appleArray = {new SafeCollection.Apple(), new SafeCollection.GrannyApple()};
        apples.addAll(Arrays.asList(appleArray));
        System.out.println("Apples in collection after allAll() : " + apples.size());

        // Runs faster, but cannot use this method to construct the collection
        Collections.addAll(apples, new SafeCollection.GrannyApple());
        System.out.println("Apples in collection after Collections.allAll() : " + apples.size());
    }
}
