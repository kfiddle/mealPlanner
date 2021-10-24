package com.example.demo.models;


import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ElementCollection
    private Map<Ingredient, Integer> amounts;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
