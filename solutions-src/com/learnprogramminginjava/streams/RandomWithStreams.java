package com.learnprogramminginjava.streams;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class RandomWithStreams {
    public static void main(String[] args) {

        new Random(42)                                        // 1) Seed a Random with 42 elements
                .ints(5, 20)     // 2) now set a range for the values
                .distinct()                                         // 3) make them distinct
                .limit(7)                                   // 4) limit the result set to 7 values
                .sorted()                                           // 5) Sort them using their natural order
                .forEach(System.out::println);                      // 6) Loop over the elements printing them


        Random rand = new Random(42);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        while(sortedSet.size() < 7) {
            int nextInt = rand.nextInt(20);
            if(nextInt < 5) continue;
            sortedSet.add(nextInt);
        }
        System.out.println(sortedSet);

    }

}

