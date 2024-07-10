package com.example.liskov;

public abstract class Ave {
    private final int Peso;

    public Ave(int peso) {
        Peso = peso;
    }

    public int getPeso() {
        return Peso;
    }
    
}
