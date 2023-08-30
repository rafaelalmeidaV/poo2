package com.mycompany.abstract29_08;

public class Cachorro extends Animal {
    public void buryBone(){
        System.out.println("Enterrando osso");
    }

    @Override
    public void sound() {
        System.out.println("Au au");
    }
}
