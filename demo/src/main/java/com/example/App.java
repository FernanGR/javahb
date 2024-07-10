package com.example;

import java.io.Writer;
import java.util.ArrayList;
import java.util.UUID;
import java.util.function.Consumer;

import com.example.AddPizza.Request;
import com.example.liskov.Aguila;
import com.example.liskov.Pinguino;
import com.example.liskov.Writter;
//import org.reflections.Reflections;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;*/

import com.example.pizza.EntityBase;
import com.example.pizza.Ingredient;
import com.example.pizza.Pizza;
import com.example.segregation.CustomerRepository;
import com.example.segregation.ServiceCustomerUpdate;


public class App {
    public static void main(String[] args) {


        //dia 2

        CustomerRepository repositoy = new CustomerRepository();
        ServiceCustomerUpdate service = new ServiceCustomerUpdate(repositoy);
        service.update(1);        


        Consumer<Object> mock = (obj)->{};

        Pinguino pinguino = new Pinguino(5);
        Aguila aguila = new Aguila(20, 100);
        Writter.printAve(aguila, mock);
        Writter.printAve(pinguino,(obj)->{});
        //error de compilacion
        //Writer.printAvVoladora(pinguino);
        //Writer.printAvNoVoladora(aguila);
       Writter.printAvNoVoladora(pinguino,System.out::println);
       Writter.printAvVoladora(aguila,System.out::println);

        public static void addPizza(){
            List<Ingredient> ingredients = new ArrayList<>();
            Ingredient ingredient = Ingredient.create(UUID.randomUUID(), "tomate", 1D);
            Ingredient ingredient = Ingredient.create(UUID.randomUUID(), "queso", 1D);

            Request req = new Request(
                "carbonara",
                "pizza Buenisima",
                "url",
                ingredient);

            

        }


        /*  dia 1 
         * 
         Ingredient ingredient = Ingredient.create(UUID.randomUUID(), "tomate", 1D);
         Pizza pizza = Pizza
         .builder()
         .setId(UUID.randomUUID())
         .setName("carbonara")
         .setDescription("excelente")
         .setUrl("url")
         .build();
         /* 
         Pizza pizza = Pizza.create(UUID.randomUUID(),
         "carbonara",
         "la mejor del mundo",
         "url");
         *//*
        pizza.addIngredient(ingredient);
        pizza.addIngredient(ingredient);
        //esto no se debería permitir
        //pizza.getIngredients().add(ingredient);
        System.err.println(pizza.getPrice());
        // EntityBase entiy = new EntityBase(UUID.randomUUID());
        System.err.println(pizza.getName());
        */
    }
    
    public static void setup() {
        /*final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
        .build();
        
        SessionFactory sessionFactory = new MetadataSources(registry)
        .addAnnotatedClass(Events.class)
        .buildMetadata()
        .buildSessionFactory();
        
        Session session = sessionFactory.openSession();

        var tr = session.beginTransaction();

        Events events = new Events();
        events.id = 1;

        session.persist(events);
        // var result = session.get(Events.class, 1);
        // session.remove(events);

        tr.commit();

        // var result = session.get(Events.class, 1);

        session.close();*/
    }
}
