package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Dog;

import java.util.List;

public interface DogService {
    List<String> findAllBreed();
    List<String> findAllNames();
    String findBreedById(Long id);
    List<Dog> findAllDogs();
}
