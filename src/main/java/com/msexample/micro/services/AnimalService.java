package com.msexample.micro.services;

import com.msexample.micro.entity.Animal;
import com.msexample.micro.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public void saveAnimal(Animal animal){
        animalRepository.save(animal);
    }

}

