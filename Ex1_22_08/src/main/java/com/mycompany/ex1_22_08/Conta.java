/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_22_08;

/**
 *
 * @author rafap
 */
public class Conta {
       private double saldo;

       public Conta(double saldo){
           this.saldo = saldo;
       }
       
       public double getSaldo(){
           return saldo;
       }
       
       public void setSaldo(int saldo){
           this.saldo = saldo;
       }
       
       public void depositar(double valor){
           saldo+=valor;
       }
       
       public void taxaAtualizar(double taxa){
           saldo += saldo * (taxa/100);
       }
}
