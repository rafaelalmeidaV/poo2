package com.mycompany.polimorfismo;

public class Cachorro extends Animal {
    public Cachorro(String nome, float peso) {
        super(nome, peso);
    }

    @Override
    public void fazendoBarulho() {
        System.out.println("Au au");
    }
}
