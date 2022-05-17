package com.msexample.micro.services;

import com.msexample.micro.entity.Animal;
import com.msexample.micro.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public void saveAnimal(Animal animal){
        animalRepository.save(animal);
    }

    public List<Animal> getAnimals() {
        return animalRepository.findAll();
    }

    public Animal findById(Long id) {
        return animalRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }
}

