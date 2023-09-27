/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao1_lista3;

/**
 *
 * @author rafap
 */
public class ContaPoupança extends Conta {
    
    public ContaPoupança(double saldo){
        super(saldo);
    } 
    
    @Override
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }
    
    @Override
    public void atualizar(double taxa){
        double novoSaldo = getSaldo() + (getSaldo() * taxa * 3); // Atualiza o saldo com base na taxa multiplicada por 2
        setSaldo(novoSaldo);
    }
}
