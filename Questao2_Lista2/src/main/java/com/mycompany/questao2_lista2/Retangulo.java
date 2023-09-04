/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2_lista2;

/**
 *
 * @author rafap
 */
public class Retangulo extends Poligono{
    
    public Retangulo(int base, int altura) {
        super(base, altura);
    }

    public Retangulo() {
    }

    @Override
    public double getArea() {
        return (super.getBase() * super.getAltura()) / 2;
    }

    @Override
    public void imprimir() {
        System.out.println("Retangulo");
        System.out.println("Base: " + super.getBase());
        System.out.println("Altura: " + super.getAltura());
        System.out.println("Area: " + getBase());
    }
}
