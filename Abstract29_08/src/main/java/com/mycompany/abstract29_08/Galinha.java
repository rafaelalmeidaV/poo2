package com.mycompany.abstract29_08;

public class Galinha extends Animal {
    
    public void layEgg(){
        System.out.println("Botando ovo");
    }

    @Override
    public void sound() {
        System.out.println("Có có");
    }
}
