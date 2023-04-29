package com.example.api_account.controller;

import com.example.api_account.dto.GenresDto;
import com.example.api_account.entity.Genres;
import com.example.api_account.repo.GenresRepository;
import com.example.api_account.service.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/genres")
public class GenresController {

    @Autowired
    private GenresRepository genresRepository;

    @GetMapping("/getAll")
    public List<Genres> getAllGenres() {
        return genresRepository.findAll();
    }
}
