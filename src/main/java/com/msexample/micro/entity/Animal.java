package com.msexample.micro.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Animal {
    @Id
    private Long id;
    private String name;
    private Double height;
    private Double weight;

}
