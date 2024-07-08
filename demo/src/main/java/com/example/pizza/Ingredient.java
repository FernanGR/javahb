package com.example.pizza;

import java.util.UUID;

public class Ingredient extends EntityBase{

    private String name;
    private Double price;
    public Ingredient(UUID id, String name, Double price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    public void update(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public static Ingredient create(UUID id, String name, Double price){
        return new Ingredient(id, name, price);
    }
    
}
