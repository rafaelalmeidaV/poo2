/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2_lista2;

/**
 *
 * @author rafap
 */
public class Quadrado extends Poligono{

    public Quadrado(int base, int altura) {
        super(base, altura);
    }

    public Quadrado() {
    }

    @Override
    public double getArea() {
        return super.getBase() * super.getAltura();
    }

    @Override
    public void imprimir() {
        System.out.println("Quadrado");
        System.out.println("Base: " + super.getBase());
        System.out.println("Altura: " + super.getAltura());
        System.out.println("Area: " + super.getBase() * super.getAltura());
        System.out.println("Perimetro: " + (super.getBase() * 2 + super.getAltura() * 2));
    }
    
}
