package com.example.pizza;

import java.util.UUID;

public interface PizzaBuilder {
          public PizzaBuilder setId(UUID id);
          public PizzaBuilder setName(String name);
          public PizzaBuilder setDescription(String description);
          public PizzaBuilder setUrl(String url);
          public Pizza build();
}
