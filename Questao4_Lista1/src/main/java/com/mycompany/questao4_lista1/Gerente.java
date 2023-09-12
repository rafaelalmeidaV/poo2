/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao4_lista1;

/**
 *
 * @author rafap
 */
public class Gerente {
    private String nome;
    private double salario;
    
    public Gerente(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumentaSalario(){
        double resul;
        resul = salario * 0.10;
        salario = salario + resul;
    }
    
    public void aumentaSalario(double taxa){
        double resul;
        resul = salario * taxa;
        salario = salario + resul;
    }
}
