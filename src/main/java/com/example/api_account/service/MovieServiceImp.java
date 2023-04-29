package com.example.api_account.service;

import com.example.api_account.entity.Movie;
import com.example.api_account.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImp implements MovieService{
    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie>getAllMovie(){
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(int id){
        return movieRepository.findById(id).get();
    }


}
