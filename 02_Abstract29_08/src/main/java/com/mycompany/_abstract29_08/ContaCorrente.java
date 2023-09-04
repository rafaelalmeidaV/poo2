/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._abstract29_08;

/**
 *
 * @author rafap
 */
public class ContaCorrente extends Conta {

    private double limiteCequeEspecial;

    public double getLimiteCequeEspecial() {
        return limiteCequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteCequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void imprimeExtratoDetalhado() {

        System.out.println(getLimiteCequeEspecial());
        System.out.println(getSaldo());
    }
}
