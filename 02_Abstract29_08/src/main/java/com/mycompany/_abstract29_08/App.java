/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._abstract29_08;

/**
 *
 * @author rafap
 */
public class App {

    public static void main(String[] args) {
        
        ContaPoupanca cp = new ContaPoupanca();
        
        cp.setSaldo(200);
        cp.setTaxaDeJuros(5);
        
        ContaCorrente cc = new ContaCorrente();
        
        cc.setSaldo(500);
        cc.setLimiteChequeEspecial(200);
        
        
        System.out.println("cp " + cp.getSaldo() + cp.getTaxaDeJuros() + "cc" + cc.getSaldo() + cc.getLimiteCequeEspecial());
        
    }
}
