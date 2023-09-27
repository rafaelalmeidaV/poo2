/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao1_lista3;

/**
 *
 * @author rafap
 */
public class Questao1_Lista3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupança cp = new ContaPoupança(10000);
        
        cc.atualizar(0.50);
        System.out.println(cc.getSaldo());
        
        cp.atualizar(0.3);
        System.out.println(cp.getSaldo());
    }
}
