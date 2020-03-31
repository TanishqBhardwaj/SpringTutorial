package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Dog;
import com.example.springbootdemo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<String> findAllBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    @Override
    public List<String> findAllNames() {
        return (List<String>) dogRepository.findAllNames();
    }

    @Override
    public String findBreedById(Long id) {
        return (String) dogRepository.findBreedById(id);
    }

    @Override
    public List<Dog> findAllDogs() {
        return (List<Dog>) dogRepository.findAll();
    }
}