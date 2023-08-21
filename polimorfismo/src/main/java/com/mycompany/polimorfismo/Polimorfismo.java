/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author rafap
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
        //Overloading
        Soma s = new Soma();
        
        int x = 2;
        int y = 3;
        System.out.println("Resultado: " + s.somar(x, y));        
        float a = 3.3f;
        float b = 2.3f;
        System.out.println("Resultado: " + s.somar(a, b));

        //Coerção        
        Coerção c = new Coerção();

        int num = 2;
        c.exibir(num);

        int n = 2;
        c.exibir((float) n);

        //Overriding
        Animal a1 = new Animal("Animal", 10);
        a1.fazendoBarulho();
        a1.Dormindo();

        Animal a2 = new Cachorro("Cachorro", 10);
        a2.fazendoBarulho();
        a2.Dormindo();

        Animal a3 = new Galinha("Galinha", 10);
        a3.fazendoBarulho();
        a3.Dormindo();

        
    }
}
