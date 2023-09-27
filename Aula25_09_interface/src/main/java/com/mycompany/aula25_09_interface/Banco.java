/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aula25_09_interface;

/**
 *
 * @author rafap
 */
public interface Banco {
    public abstract boolean saque(Conta conta, double valor);
    public abstract boolean deposito(Conta conta, double valor);
    public abstract void extrato(Conta conta);
}
