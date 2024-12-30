package com.lastname.movierepo.repository;

import com.lastname.movierepo.entity.Movie;

import java.util.List;

public interface MovieDatabase {
    List<Movie> getMovies();
}
