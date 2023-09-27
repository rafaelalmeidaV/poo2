/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula25_09_interface;

/**
 *
 * @author rafap
 */
public class BancoSakurai {
    private Conta contaBancoSakurai;
    
    public BancoSakurai(){
        this.contaBancoSakurai = new Conta();
        this.contaBancoSakurai.setNomeProprietario("Banco Sakurai");
        this.contaBancoSakurai.setNumero(0);
        this.contaBancoSakurai.setSaldo(0.00);
    }
    
    @Override
    public boolean saque(Conta conta, double valor){
        if (conta.getSaldo() >= valor) {
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo(novoValor);
            System.out.println("Saque efetuado!");
            return true;
        }
        else {
            System.out.println("Nao conseguiu fazer o saque!");
            extrato(conta);
            return false;
        }
    }
}
