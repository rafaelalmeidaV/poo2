/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._abstract29_08;

/**
 *
 * @author rafap
 */
public abstract class Conta {
       private double saldo;
       
       public double getSaldo(){
           return saldo;
       }
       
       public void setSaldo(double saldo){
           this.saldo = saldo;
       }
       
       public abstract void imprimeExtratoDetalhado();
       
}
