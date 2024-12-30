package com.lastname.movierepo.ui.console;

import com.lastname.movierepo.entity.Movie;

import java.util.Comparator;

public class SortByYear implements Comparator<Movie>
{

    @Override
    public int compare(Movie rhs, Movie lhs) {
        return Integer.compare(lhs.getYear(), rhs.getYear());
    }
}
