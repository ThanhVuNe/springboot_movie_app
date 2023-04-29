package com.example.api_account.service;

import com.example.api_account.dto.GenresDto;
import com.example.api_account.entity.Genres;
import com.example.api_account.entity.Movie;
import com.example.api_account.repo.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenresServiceImp implements  GenresService{

    @Autowired
    private GenresRepository genresRepository;

    @Override
    public List<GenresDto> getAllGenres() {
        List<GenresDto> getAll = new ArrayList<>();
        List<Genres>genresList= genresRepository.findAll();
//        for (Genres genres: genresList) {
//            GenresDto genresDto = new GenresDto();
//            genresDto.setId(genres.getId());
//            genresDto.setTitle(genres.getTitle());
//            genresDto.setMovies(genres.getListMovie().stream().map(Movie::getId).collect(Collectors.toSet()));
//            getAll.add(genresDto);
//        }
        return getAll;
    }
}
