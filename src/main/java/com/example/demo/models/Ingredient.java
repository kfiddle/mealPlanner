package com.example.demo.models;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Ingredient {

//    @Id
//    @GeneratedValue
//    private Long id;

    private String name;

    public Ingredient() {
    }

    public Ingredient(String name) {
        this.name = name;
    }

//    public Long getId() {
//        return id;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
