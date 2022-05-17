package com.msexample.micro.controller;

import com.msexample.micro.entity.Animal;
import com.msexample.micro.services.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @PostMapping("/animal")
    public ResponseEntity<String> add(@RequestBody Animal animal){
        Optional.ofNullable(animal).orElseThrow(NullPointerException::new);
        animalService.saveAnimal(animal);
        return new ResponseEntity<>("Added successfully", HttpStatus.OK);
    }
}
