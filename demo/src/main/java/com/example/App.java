package com.example;

import java.util.UUID;

import com.example.pizza.EntityBase;
import com.example.pizza.Ingredient;
import com.example.pizza.Pizza;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Ingredient ingredient = Ingredient.create(UUID.randomUUID(), "tomate", 1.0);
        Pizza pizza = Pizza.create(UUID.randomUUID(), "carbonara", "la mejor", "url");
        pizza.addIngredient(ingredient);
        //esto no se deberia permitir
        pizza.getIngredients().add(ingredient);

        System.err.println(pizza.getPrice());

        ingredient.getId();
        ingredient.getName();
        ingredient.getPrice();

        // EntityBase entiy = new EntityBase(UUID.randomUUID());
      
    }
}
