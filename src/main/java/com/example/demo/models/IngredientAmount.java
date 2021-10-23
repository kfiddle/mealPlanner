package com.example.demo.models;

import javax.persistence.*;

@Entity
public class IngredientAmount {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Ingredient ingredient;

    @Embedded
    private Unit unit;

    public IngredientAmount() {
    }

    public IngredientAmount(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public IngredientAmount(Ingredient ingredient, Unit unit) {
        this.ingredient = ingredient;
        this.unit = unit;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Unit getUnit() {
        return unit;
    }
}
