/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_22_08;

/**
 *
 * @author rafap
 */
public class ContaPoupança extends Conta {

    public ContaPoupança(double saldo) {
        super(saldo);
    }

    @Override
    public void taxaAtualizar(double taxa) {
        super.taxaAtualizar(taxa * 3);
    }
    
    @Override
    public void depositar(double valor){
        super.depositar(valor - 0.10);
    }

}
