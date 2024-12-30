package com.lastname.movierepo.repository;

import com.lastname.movierepo.controller.MovieController;
import com.lastname.movierepo.entity.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class MovieDatabaseImpl implements MovieDatabase {
    final public String DEFAULT_FILENAME = "movies.csv";
    final private List<Movie> movies = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(MovieDatabaseImpl.class.getName());

    final private String fileName;

    public MovieDatabaseImpl() {
        this.fileName = DEFAULT_FILENAME;
        loadMovies();
    }

    public MovieDatabaseImpl(String fileName) {
        this.fileName = fileName;
        loadMovies();
    }

    private void loadMovies(){
        Scanner fileInput;

        try {
            final URL url = MovieDatabaseImpl.class.getResource(fileName);
            String path;

            if (url == null) {
                logger.fine("File not found: " + fileName);
                return;
            } else {
                path = url.getPath();
            }

            fileInput = new Scanner(new File(path).getAbsoluteFile());

            while (fileInput.hasNext()) {

                final String line = fileInput.nextLine();
                final String[] strings = line.split(",", -1);
                Movie movie = toMovie(strings);
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            logger.fine("File " + fileName + " not found");
        }
        logger.fine("Loaded " + movies.size() + " movies");
    }

    @Override
    public String toString() {
        return movies.toString();
    }

    /*
    * Sample Row:
    * 1,	Back to the Future,     	1985,	APRIL,      US
     */
    private Movie toMovie(String[] elements){
        if (elements.length == 0) return null;
        final int id = Integer.parseInt(elements[0]);
        final String name               = elements[1];
        final int year = Integer.parseInt(elements[2]);
        final Month month = Month.valueOf(elements[3]);
        final Locale locale = Locale.of(elements[4]);
        return new Movie(id, name, year, month, locale);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public static void main(String[] args) {
        StreamHandler streamHandler = new StreamHandler(System.out, new SimpleFormatter());
        streamHandler.setLevel(Level.FINEST);
        logger.addHandler(streamHandler);
        logger.setLevel(Level.FINEST);

        MovieDatabaseImpl movieDatabase = new MovieDatabaseImpl();
        for (Movie movie : movieDatabase.getMovies()) {
            logger.fine(movie.toString());
        }


    }

}
