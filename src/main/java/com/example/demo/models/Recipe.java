package com.example.demo.models;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String notes;

    @OneToMany
    private Collection<IngredientAmount> ingredientAmounts;

    public Recipe() {
    }

    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }

    public Recipe(String name, String notes, Collection<IngredientAmount> ingredientAmounts) {
        this.name = name;
        this.notes = notes;
        this.ingredientAmounts = ingredientAmounts;
    }

    public Recipe(Collection<IngredientAmount> ingredientAmounts) {
        this.ingredientAmounts = ingredientAmounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setIngredientAmounts(Collection<IngredientAmount> ingredientAmounts) {
        this.ingredientAmounts = ingredientAmounts;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public Collection<IngredientAmount> getIngredientAmounts() {
        return ingredientAmounts;
    }

    public void setAllProps(Recipe incoming) {
        if (incoming.getName() != null) {
            this.setName(incoming.getName());
        }
        if (incoming.getNotes() != null) {
            this.setNotes(incoming.getNotes());
        }
        if (incoming.getIngredientAmounts() != null) {
            this.setIngredientAmounts(incoming.getIngredientAmounts());
        }

    }
}
