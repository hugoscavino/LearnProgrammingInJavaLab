package com.learnprogramminginjava.streams;

import java.util.Arrays;
import java.util.List;

public class MatchingDemo {
    public static void main(String[] args) {
        List<Movie> movieList = Arrays.asList(new Movie(1, "Conan", 1984),
                new Movie(2, "The Godfather", 1972),
                new Movie(3, "The Godfather: Part II", 1974),
                new Movie(4, "The Dark Knight", 2008),
                new Movie(5,"Wicked", 2024));

        System.out.println("Any Movies Older than 1970 | " +
                movieList.stream().anyMatch(m -> m.year > 1970));

        System.out.println("Are All the Movies from 2024 | " +
                movieList.stream().allMatch(m -> m.year == 2024));

        System.out.println("No Vintage Movie | " +
                movieList.stream().noneMatch(m -> m.year < 1950));

    }
}
