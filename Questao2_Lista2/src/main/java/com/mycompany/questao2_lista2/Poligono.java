/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2_lista2;

/**
 *
 * @author rafap
 */
public abstract class Poligono {
    
    private double base;
    private double altura;

    public Poligono(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Poligono() {
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public abstract double getArea();

    public abstract void imprimir();
}
