package com.example.api_account.service;

import com.example.api_account.entity.Movie;

import java.util.List;

public interface MovieService {
    public List<Movie> getAllMovie();
    public Movie getMovieById(int id);
}
