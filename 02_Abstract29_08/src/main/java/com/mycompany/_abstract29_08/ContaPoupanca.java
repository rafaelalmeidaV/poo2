/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._abstract29_08;

/**
 *
 * @author rafap
 */
public class ContaPoupanca extends Conta {
    private double taxaDeJuros;
    
    public double getTaxaDeJuros(){
        return taxaDeJuros;
    }
    
    public void setTaxaDeJuros(double taxaDeJuros){
        this.taxaDeJuros = taxaDeJuros;
    }
    
    @Override
    public void imprimeExtratoDetalhado(){
        System.out.println(getTaxaDeJuros());
        System.out.println(getSaldo());
    }
}
