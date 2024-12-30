package com.lastname.movierepo.controller;

import com.lastname.movierepo.entity.Movie;
import com.lastname.movierepo.repository.MovieDatabase;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class MovieController {
    private static final Logger logger = Logger.getLogger(MovieController.class.getName());

    final private MovieDatabase movieDatabase;

    public MovieController(MovieDatabase movieDatabase) {
        this.movieDatabase = movieDatabase;
    }

    public int getMovieCount() {
        return this.movieDatabase.getMovies().size();
    }

    public List<Movie> getMovies() {
        return movieDatabase.getMovies();
    }

    public static void main(String[] args) {
        StreamHandler streamHandler = new StreamHandler(System.out, new SimpleFormatter());
        streamHandler.setLevel(Level.ALL);
        logger.addHandler(streamHandler);
        logger.setLevel(Level.ALL);

        MovieDatabase database = new MovieDatabase() {
            @Override
            public List<Movie> getMovies() {
                List<Movie> movies = new ArrayList<>();
                movies.add(new Movie(1,"Test", 2000, Month.AUGUST, Locale.US));
                return movies;
            }
        };

        MovieController movieController = new MovieController(database);
        List<Movie> movies = movieController.getMovies();
        for (Movie movie : movies) {
            logger.fine("Movie: " + movie);
        }

    }

}
