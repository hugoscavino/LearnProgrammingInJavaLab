package movierepo.entity;

import java.time.Month;
import java.util.Locale;

public class Movie implements Comparable<Movie> {

    private final int id;
    private final String name;
    private final int year;
    private final Month month;
    private final Locale locale;

    /**
     * Create a no arg constructor
     */
    private Movie(){
        // TODO
    }

        /**
         * Primary Key only constructor. Note that movie id are created sequentially. So a
         * movie with a lower id would have been created/published before a movie with a
         * higher id.
         * @param id The unique key for the movie. There is only of these for all movies
         *           across years, remakes, and languages.
         */
    private Movie(int id){
        // TODO
    }

    /**
     * Immutable constructor all fields are determined
     * @param id The unique key for the movie. There is only of these for all movies
     *           across years, remakes, and languages.
     * @param name The published name of the Movie in the Movie's Locale
     * @param year The published year
     * @param locale The local (region) where the movie was intended
     */
    public Movie(int id, String name, int year, Month month, Locale locale ) {
        // TODO
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getYear() { return year; }
    public Locale getLocale() { return locale; }
    public Month getMonth() { return month; }


    @Override
    public boolean equals(Object other) {

        // TODO
        return false;

    }

    /**
     * Compare on movieID
     * STEP 2 - Implement the compareTo interface
     * Compares this object with the specified object for order.
     * Returns a negative integer, zero, or a positive integer
     * as this object is less than,
     * equal to, or greater than the specified object.
     * @param rhs the object to be compared.
     * @return -1 if movieID < rhs.movieID, 1 if movieID > rhs.movieID, else 0 as they are equal
     */
    public int compareTo(Movie rhs){
        if (this.id < rhs.getId()){
            return -1;
        } else if (this.id > rhs.getId()){
            return 1;
        }
        return 0;
    }



    public static void main(String[] args) {
        Movie m1 = new Movie(1);
        Movie m2 = new Movie(1);

        if (m1.equals(m2)){
            System.out.println("m1.equals(m2)");
        }
    }

    @Override
    public String toString() {

        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", locale=" + locale +
                '}';
    }
}