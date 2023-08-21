/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco;

/**
 *
 * @author rafap
 */
public class Banco {

    public static void main(String[] args) {

        Funcionario.valeRefeicaoDiario = 15;

        Funcionario f1 = new Funcionario();
        f1.nome = "Rafael Consentino";
        f1.salario = 1000;
        
        Funcionario f2 = new Funcionario();
        f2.nome = "Pedro Cardoso";
        f2.salario = 1200;
        
        System.out.println("Funcionario: " + f1.nome + 
                " Salario: " + f1.salario + 
                " Vale Refeição: " + Funcionario.valeRefeicaoDiario);
        
                System.out.println("Funcionario: " + f2.nome + 
                " Salario: " + f2.salario + 
                " Vale Refeição: " + Funcionario.valeRefeicaoDiario);
                
         Funcionario.reajustarValeRefeicaoDiario(0.1);
         
         System.out.println("Funcionario: " + f1.nome + 
                " Salario: " + f1.salario + 
                " Vale Refeição: " + Funcionario.valeRefeicaoDiario);
        
                System.out.println("Funcionario: " + f2.nome + 
                " Salario: " + f2.salario + 
                " Vale Refeição: " + Funcionario.valeRefeicaoDiario);
         
         
        
                
        
    }
}
