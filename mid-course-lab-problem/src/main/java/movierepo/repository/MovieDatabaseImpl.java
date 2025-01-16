package movierepo.repository;

import com.lastname.movierepo.controller.MovieController;
import com.lastname.movierepo.entity.Movie;
import com.lastname.movierepo.repository.MovieDatabase;

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
        //return new Movie(...);
        return null;
    }

    //public XXXX {
    //    return movies;
    //}

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
