package com.lastname.movierepo.ui.console;

import com.lastname.movierepo.controller.MovieController;
import com.lastname.movierepo.entity.Movie;
import com.lastname.movierepo.repository.MovieDatabase;
import com.lastname.movierepo.repository.MovieDatabaseImpl;

import java.util.*;

public class ConsoleUI {

    public static final String SORT_BY_NAME = "Name";
    public static final String SORT_BY_ID = "ID";
    public static final String SORT_BY_YEAR = "Year";
    public static final String SORT_BY_REVERSE_YEAR = "ReverseYear";
    private final MovieController movieController;
    private static final Scanner scanner = new Scanner(System.in);
    private final static int MAX_CHOICES = 8;

    public ConsoleUI() {
        MovieDatabase movieDatabase = new MovieDatabaseImpl();
        movieController = new MovieController(movieDatabase);
    }


    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();
        System.out.println(consoleUI.movieController.getMovieCount());

        int choice;
        List<Movie> movies = consoleUI.movieController.getMovies();
        do {
            choice = getMenuChoice();
            switch (choice) {
                // case 1 is done for you
                case 1:
                    consoleUI.displayMovies(movies);
                    break;
                case 2:
                    List<Movie> sortedMoviesByName = consoleUI.sortBy(SORT_BY_NAME, movies);
                    consoleUI.displayMovies(sortedMoviesByName);
                    break;
                case 3:
                    List<Movie> sortedMoviesByYear = consoleUI.sortBy(SORT_BY_YEAR, movies);
                    consoleUI.displayMovies(sortedMoviesByYear);
                    break;
                case 4:
                    List<Movie> sortedMoviesByRevYear = consoleUI.sortBy(SORT_BY_REVERSE_YEAR, movies);
                    consoleUI.displayMovies(sortedMoviesByRevYear);
                    break;
                case 5:
                    System.out.print("Enter the movie name: ");
                    // Use nextLine() everywhere!
                    String name = scanner.nextLine();
                    System.out.println("Searching on name : " + name);
                    List<Movie> nameSearchMovies = consoleUI.searchByName(name, movies);
                    consoleUI.displayMovies(nameSearchMovies);
                    break;
                case 6:
                    // Your code here
                    System.out.print("Enter the movie Year: ");
                    // Use nextLine() everywhere!
                    String year = scanner.nextLine();
                    System.out.println("Searching on year : " + year);
                    List<Movie> foundMovies = consoleUI.searchByYear(Integer.parseInt(year), movies);
                    consoleUI.displayMovies(foundMovies);
                    break;
                case 7:
                    // Your code here
                    System.out.print("Enter the movie Year: ");
                    // Use nextLine() everywhere!
                    String localeStr = scanner.nextLine();
                    Locale locale = Locale.of(localeStr);
                    System.out.println("Searching on Locale : " + locale);
                    List<Movie> foundMoviesByLocale = consoleUI.searchByLocale(locale, movies);
                    consoleUI.displayMovies(foundMoviesByLocale);
                    break;
                case 8:
                    System.out.println("Bye");
                    break;
                default:
                   System.out.println("Invalid choice");
                   break;
            }
        } while (choice != MAX_CHOICES);
    }

    private List<Movie> searchByName(String name, List<Movie> movies) {
        List<Movie> list = new ArrayList<>();

        if (movies.isEmpty()) {
            System.out.println("Nothing to search by");
        } else {
            for (Movie m: movies) {
                if (m.getName().toLowerCase().contains(name.toLowerCase())) {
                    list.add(m);
                }
            }
        }

        return list;
    }

    private List<Movie> searchByYear(int year, List<Movie> movies) {
        List<Movie> list = new ArrayList<>();

        if (movies.isEmpty()) {
            System.out.println("No Year to search by");
        } else {
            for (Movie m: movies) {
                if (m.getYear() == year) {
                    list.add(m);
                }
            }
        }

        return list;
    }

    private List<Movie> searchByLocale(Locale locale, List<Movie> movies) {
        List<Movie> list = new ArrayList<>();

        if (movies.isEmpty()) {
            System.out.println("No Locale to search by");
        } else {
            for (Movie m: movies) {
                if (m.getLocale() == locale) {
                    list.add(m);
                }
            }
        }

        return list;
    }

    private void displayMovies(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("Nothing to display");
        } else {
            System.out.format("%7s %50s %5s %10s %15s\n", "ID", "Name", "Year", "Month", "Locale");
            for (Movie m: movies) {
                System.out.format("%7s %50s %5d %10s %15s", m.getId(), m.getName(),
                        m.getYear(), m.getMonth(), m.getLocale().toString().toUpperCase());
                System.out.println();
            }
        }
        System.out.println();
    }

    /*
   Don't change this method
*/
    public static int getMenuChoice() {


        System.out.println("""
                1. Display by ID
                2. Display by name
                3. Display by year
                4. Display by year in reverse
                5. Search by name
                6. Search by year
                7. Search by Locale
                8. Quit""");
        System.out.print("Enter your choice: ");
        int choice = MAX_CHOICES;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Choose 1.." + MAX_CHOICES);
        }
        if (choice < 1 || choice > MAX_CHOICES) {
            choice = MAX_CHOICES;
        }
        return choice;

    }

    // Sort according to the field indicated by s
    public List<Movie> sortBy(String s, List<Movie> movies) {
        switch (s) {
            case SORT_BY_ID:
                Collections.sort(movies);
                break;
            case SORT_BY_NAME:
                // Your code here
                movies.sort(Comparator.comparing(Movie::getName));
                break;
            case SORT_BY_YEAR:
                // Your code here
                movies.sort(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie rhs, Movie lhs) {

                        return Integer.compare(lhs.getYear(), rhs.getYear());
                    }
                });
                break;
            case SORT_BY_REVERSE_YEAR:
                // Your code here
                Comparator<Movie> c = Collections.reverseOrder(new SortByYear());
                movies.sort(c);
                break;
        }

        return movies;
    }
}
