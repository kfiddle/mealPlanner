package com.example.demo.models;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Ingredient {

    private String name;
    private int amount;

    public Ingredient() {
    }

    public Ingredient(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
