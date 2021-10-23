package com.example.demo.models;

import javax.persistence.Embeddable;

@Embeddable
public class Unit {

    private int number;

    public Unit() {
    }

    public Unit(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

