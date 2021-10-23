package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private Collection<Recipe> recipes;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecipes(Collection<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean userHasIngredient(Ingredient ingredientToFind) {
        boolean flag = false;
        for (Recipe recipe : recipes) {
            for (IngredientAmount ingredientAmount : recipe.getIngredientAmounts()) {
                if (ingredientAmount.getIngredient().getName().equals(ingredientToFind.getName())) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }
}
