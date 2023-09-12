/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacao;

/**
 *
 * @author rafap
 */
public class Telefone {
    private String ddd;
    private String numero;
    
    public Telefone(String ddd, String numero){
        this.ddd = ddd;
        this.numero = numero;
    }
    
    public Telefone(){
        
    }
    
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
