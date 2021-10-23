package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Collection<IngredientAmount>

}
