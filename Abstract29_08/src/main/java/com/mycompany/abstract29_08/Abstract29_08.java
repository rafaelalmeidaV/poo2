/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstract29_08;

/**
 *
 * @author rafap
 */
public class Abstract29_08 {

    public static void main(String[] args) {
         
        Cachorro toto = new Cachorro();

        toto.setName("Toto");
        toto.setWeight(5.6);

        System.out.println("Nome: " + toto.getName() + "\nPeso: " + toto.getWeight());
        toto.sound();
        toto.buryBone();

        Galinha carijo = new Galinha();

        carijo.setName("Carijó");
        carijo.setWeight(1.2);

        System.out.println("Nome: " + carijo.getName() + "\nPeso: " + carijo.getWeight());
        carijo.sound();
        carijo.layEgg();
        
    }   
}
