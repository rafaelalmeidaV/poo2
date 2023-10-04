/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoaula26_09;

/**
 *
 * @author rafap
 */
public class ProjetoAula26_09 {

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo(10, 5, 10, 10, 10);
        System.out.println("Triangulo");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Lado A: " + triangulo.getLadoA());
        System.out.println("Lado B: " + triangulo.getLadoB());
        System.out.println("Lado C: " + triangulo.getLadoC());
        System.out.println("Area: " + triangulo.getArea());
        System.out.println("Perimetro: " + triangulo.getPerimetro());
        
        Quadrado quadrado = new Quadrado(10);
        System.out.println("Quadrado");
        System.out.println("Area: " + quadrado.getArea());
        System.out.println("Perimetro: " + quadrado.getPerimetro());
        
        
        
        
    }
}
