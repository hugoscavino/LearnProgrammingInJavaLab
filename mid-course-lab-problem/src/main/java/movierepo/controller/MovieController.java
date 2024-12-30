package movierepo.controller;

import com.lastname.movierepo.entity.Movie;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class MovieController {
    private static final Logger logger = Logger.getLogger(MovieController.class.getName());

    public MovieController() {
        // TODO
        // Change the constructor to take in the MovieDatabase
    }

    public int getMovieCount() {
        // TODO
        return 0;
    }

    public List<Movie> getMovies() {
        // TODO
        return List.of();
    }

    public static void main(String[] args) {
        StreamHandler streamHandler = new StreamHandler(System.out, new SimpleFormatter());
        streamHandler.setLevel(Level.ALL);
        logger.addHandler(streamHandler);
        logger.setLevel(Level.ALL);

        // TODO Loop through the list and print out each line to the logger
    }

}
