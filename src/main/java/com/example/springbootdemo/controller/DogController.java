package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Dog;
import com.example.springbootdemo.service.DogNotFoundException;
import com.example.springbootdemo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> list = dogService.findAllDogs();
        return new ResponseEntity<List<Dog>>(list, HttpStatus.OK);
    }

    @GetMapping("/dogNames")
    public ResponseEntity<List<String>> getAllNames() {
        List<String> list = dogService.findAllNames();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/dogBreeds")
    public ResponseEntity<List<String>> getAllBreeds() {
        List<String> list = dogService.findAllBreed();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}/dogBreed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id) {
        Optional<String> optional = Optional.ofNullable(dogService.findBreedById(id));
        String list = optional.orElseThrow(DogNotFoundException::new);
        return new ResponseEntity<String>(list, HttpStatus.OK);
    }
}