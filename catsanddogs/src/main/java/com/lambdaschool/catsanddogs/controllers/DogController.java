package com.lambdaschool.catsanddogs.controllers;

import com.lambdaschool.catsanddogs.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController
{
    @Autowired
    private DogRepository dogRepos;

    @GetMapping(value = "/dogs", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs()
    {
        return new ResponseEntity<>(dogRepos.findAll(), HttpStatus.OK);
    }
}
