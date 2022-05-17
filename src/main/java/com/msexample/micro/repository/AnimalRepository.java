package com.msexample.micro.repository;

import com.msexample.micro.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
