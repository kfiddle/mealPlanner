package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ElementCollection
    private Collection<Ingredient> ingredients;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }
}
