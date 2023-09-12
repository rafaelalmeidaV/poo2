/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4_lista1;

/**
 *
 * @author rafap
 */
public class Questao4_Lista1 {

    public static void main(String[] args) {
        Gerente g = new Gerente("rafael", 1000);
        
        g.aumentaSalario();
         System.out.println(g.getSalario()); 
         
         g.aumentaSalario(0.3);
         System.out.println(g.getSalario());
        
    }
}
