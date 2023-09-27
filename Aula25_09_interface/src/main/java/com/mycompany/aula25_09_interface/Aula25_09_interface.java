/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula25_09_interface;

/**
 *
 * @author rafap
 */
public class Aula25_09_interface {

    public static void main(String[] args) {
        Banco bancoCristiano = new BancoCristiano();
        Conta contaC = new Conta();
        
        contaC.setNomeProprietario("Joao");
        contaC.setNumero(111);
        contaC.setSaldo(1000);
        
        bancoCristiano.deposito(contaC, 100.00);
        bancoCristiano.saque(contaC, 50.00);
        bancoCristiano.extrato(contaC);
        
        Banco bancoSakurai = new BancoSakurai();
        Conta contaS = new Conta();
        
        contaS.setNomeProprietario("rafael");
        contaS.setNumero(222);
        contaS.setSaldo(500);
                
         bancoSakurai.deposito(contaS, 100.00);
         bancoSakurai.saque(contaS, 50.00);
         bancoSakurai.extrato(contaS);
         
    }
}
