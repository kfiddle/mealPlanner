package com.example.demo.models;


import javax.persistence.*;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Ingredient() {
    }

    public Ingredient(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

//cup = 1/2 pint, 8 fluid ounces 236 ml pounds

