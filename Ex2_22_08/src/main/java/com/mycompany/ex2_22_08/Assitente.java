/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2_22_08;

/**
 *
 * @author rafap
 */
public class Assitente extends Funcionario {
        
    int matricula;

    public Assitente(String nome, int matriula) {
        super(nome);
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    
    @Override
    public void imprimir(){
        System.out.println("nome: " + this.getNome() + "matricula: " + this.getMatricula());
    }
    
}
