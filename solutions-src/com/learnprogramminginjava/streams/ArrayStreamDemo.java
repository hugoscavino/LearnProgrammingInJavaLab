package com.learnprogramminginjava.streams;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayStreamDemo {
    public static void main(String[] args) {
        Movie[] movies = {new Movie(1,"Conan",  1984),
                new Movie(2, "The Godfather", 1972),
                new Movie(3, "The Godfather: Part II", 1974)};

        // Traditional enhanced for loop
        for(Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("-------------------- for each ------------");
        // Using the Arrays.stream
        Arrays.stream(movies).forEach(System.out::println);

        System.out.println("-------------------- comparable ------------");
        // Using the Comparable from Movie
        Arrays.stream(movies).sorted().forEach(System.out::println);

        System.out.println("-------------------- Comparator ------------");
        // Using a new Comparable from Movie
        Movie[] newMovieList = {new Movie(654,"2024 Movie",  2024),
                new Movie(123, "Older Movie", 1972),
                new Movie(325, "Previous Movie", 2023)};

        Arrays.stream(newMovieList).
                sorted(Comparator.comparing(movie -> movie.id)).
                forEach(System.out::println);

        System.out.println("-------------------- filter ------------");

        // Remove movies before 2023
        Arrays.stream(newMovieList).
                filter(movie -> movie.year >= 2023).
                forEach(System.out::println);
    }
}
