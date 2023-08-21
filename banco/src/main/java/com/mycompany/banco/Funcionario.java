/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author rafap
 */
public class Funcionario {

    String nome;
    double salario;
    static double valeRefeicaoDiario;
    
    static void reajustarValeRefeicaoDiario(double taxa){
        valeRefeicaoDiario += valeRefeicaoDiario * taxa;
    }
}
