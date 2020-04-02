package com.example.springbootdemo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springbootdemo.entity.Dog;
import com.example.springbootdemo.repository.DogRepository;
import com.example.springbootdemo.service.DogNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> findAllDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public Dog findDogById(Long id) {
        Optional<Dog> dogOptional = dogRepository.findById(id);
        if (dogOptional.isPresent()) {
            return dogOptional.get();
        }
        else {
            throw new DogNotFoundException();
        }
    }
}
