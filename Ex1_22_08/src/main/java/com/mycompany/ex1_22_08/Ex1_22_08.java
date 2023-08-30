/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1_22_08;

/**
 *
 * @author rafap
 */
public class Ex1_22_08 {

    public static void main(String[] args) {
        
        Conta conta = new Conta(1000);
        Conta cc = new Conta(2000);
        Conta cp = new Conta(3000);

        conta.taxaAtualizar(10);
        cc.taxaAtualizar(10);
        cp.taxaAtualizar(10);

        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Saldo da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta poupança: " + cp.getSaldo());
        
        
        
    }
}
