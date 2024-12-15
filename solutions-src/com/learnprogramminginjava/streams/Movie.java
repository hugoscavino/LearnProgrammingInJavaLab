package com.learnprogramminginjava.streams;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    int id;
    String title;
    int year;

    public Movie(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        return 31 * result + year;
    }

    @Override
    public int compareTo(Movie o) {
        // First compare the integer field
        int numberComparison = Integer.compare(this.year, o.year);
        if (numberComparison != 0) {
            return numberComparison; // Return if integers are not equal
        }

        // If integers are equal, compare the string field
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return  title +
                " [" + year + "]";
    }
}
