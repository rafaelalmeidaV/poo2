/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao1_lista3;

/**
 *
 * @author rafap
 */
public abstract class Conta {
    private double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public  void depositar(double valor){
        saldo += valor;
    }
    
    public void atualizar(double taxa){
        saldo += saldo * taxa;

    }
    
}
