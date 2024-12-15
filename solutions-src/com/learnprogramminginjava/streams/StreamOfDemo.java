package com.learnprogramminginjava.streams;

import java.util.stream.Stream;

public class StreamOfDemo {
    public static void main(String[] args) {

        Stream.of(  new Movie(1,"Conan", 1984),
                    new Movie(2, "The Godfather", 1972),
                    new Movie(3, "The Godfather: Part II",1974)
                    ).forEach(System.out::println);

        Stream.of("Welcome", "To", "Java").forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);

    }
}
