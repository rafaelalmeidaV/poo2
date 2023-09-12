/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3_lista1;

/**
 *
 * @author rafap
 */
public class Circulo {
    private double x;
    private double y;
    private double raio;
    
    
    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this. raio = raio;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    public double perimetroCirculo(){
        double resultado;
        resultado = 2*3.14*raio;
        return resultado;
    }
    
    public double calcularAreaDoCirculo(){
        double resultado;
        resultado = 3.14*(raio*raio);
        return resultado;
    }
    
    public void acrescentarRaio(double novoRaio){
        setRaio(raio+novoRaio);
    }
    public void diminuirRaio(double novoRaio){
        setRaio(raio-novoRaio);
    }
}
