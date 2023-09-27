/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula25_09_interface;

/**
 *
 * @author rafap
 */
public class BancoCristiano implements Banco{
    
    private Conta contaBancoCristiano;
    
    public BancoCristiano(){
        this.contaBancoCristiano = new Conta();
        this.contaBancoCristiano.setNomeProprietario("Banco Cristiano");
        this.contaBancoCristiano.setNumero(0);
        this.contaBancoCristiano.setSaldo(0.00);
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
    
    @Override
    public boolean deposito(Conta conta, double valor){
        double novoValor = conta.getSaldo() + valor;
        conta.setSaldo(novoValor);
        System.out.println("Deposito efetuado!");
        return true;
    }
    
    @Override
    public void extrato(Conta conta){
        System.out.println("\n--------------BANCO CRISTIANO---------------");
        System.out.println("-> EXTRATO CONTA \n");
        System.out.println("Nome: " + conta.getNomeProprietario());
        System.out.println("Numero " + conta.getNumero());
        System.out.println("Saldo " + conta.getSaldo());
        System.out.println("\n--------------------------------------------------------\n");
    }
    
    public boolean transferencia(Conta contaOrigem, Conta contaDestino, double valor){
        boolean fazSaque = saque(contaOrigem, valor);
        
        if(fazSaque){
            deposito(contaDestino, valor);
            System.out.println("Transferencia efetuada");
            return true;
        }
        else {
            System.out.println("Nao coneguiu fazer a transferencia");
            return false;
        }
    }
}
