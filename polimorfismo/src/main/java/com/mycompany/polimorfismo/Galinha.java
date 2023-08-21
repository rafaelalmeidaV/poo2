package com.mycompany.polimorfismo;

public class Galinha extends Animal{
    public Galinha(String nome, float peso) {
        super(nome, peso);
    }
    
    public void botarOvo(){
        System.out.println("Botando ovo");
    }

    @Override
    public void fazendoBarulho(){
        System.out.println("Có có");
    }
}
