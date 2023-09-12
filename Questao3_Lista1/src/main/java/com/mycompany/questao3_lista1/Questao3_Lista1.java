/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao3_lista1;

/**
 *
 * @author rafap
 */
public class Questao3_Lista1 {

    public static void main(String[] args) {
        Circulo circ1 = new Circulo(3,4,5);
        Circulo circ2 = new Circulo(0,0,2);
        
        circ1.acrescentarRaio(3); 
        System.out.println(circ1.perimetroCirculo());
        
        circ1.diminuirRaio(1);
        
        
        
       
    }
}
