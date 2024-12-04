package com.learnprogramminginjava.lambdas;

import java.util.Arrays;
import java.util.List;

public class SimpleLambdas {

    public static void main(String[] args) {

        // Functional style
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.forEach(n -> System.out.println(n * 2));

        System.out.println("--------------------");

        // compare to
        for (Integer n : numbers) {
            System.out.println(n * 2);
        }
        // Same results but less syntax and less error-prone

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);
        // Equivalent to (name -> System.out.println(name))!

    }
}
