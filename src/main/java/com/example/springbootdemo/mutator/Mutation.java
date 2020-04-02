package com.example.springbootdemo.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springbootdemo.entity.Dog;
import com.example.springbootdemo.repository.DogRepository;
import com.example.springbootdemo.service.DogNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    private DogRepository dogRepository;

    public Mutation(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public boolean deleteDogBreed(String breed) {
        boolean deleted = false;
        Iterable<Dog> dogs = dogRepository.findAll();
        for(Dog dog : dogs) {
            if (dog.getBreed().equals(breed)) {
                dogRepository.delete(dog);
                deleted = true;
            }
        }
        if(!deleted) {
            throw new DogNotFoundException();
        }
        return deleted;
    }

    public Dog updateDogName(String newName, Long id) {
        Iterable<Dog> dogs = dogRepository.findAll();
        for (Dog dog: dogs) {
            if(dog.getId().equals(id)) {
                dog.setName(newName);
                dogRepository.save(dog);
                return dog;
            }
        }
        throw new DogNotFoundException();
    }
}