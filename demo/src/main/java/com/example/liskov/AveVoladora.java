package com.example.liskov;

public class AveVoladora extends Ave{
    
    private final int velocidad;
    public AveVoladora(int peso, int velocidad) {
        super(peso);
        this.velocidad = velocidad;
    }
    public int getVelocidad(){
        return this.velocidad;
    }
}
