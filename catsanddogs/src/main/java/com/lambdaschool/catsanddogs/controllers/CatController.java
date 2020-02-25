package com.lambdaschool.catsanddogs.controllers;

import com.lambdaschool.catsanddogs.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController
{
    @Autowired
    private CatRepository catRepos;

    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllCats()
    {
        return new ResponseEntity<>(catRepos.findAll(), HttpStatus.OK);
    }
}
