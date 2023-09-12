/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacao;

/**
 *
 * @author rafap
 */
public class Pessoa {

    private String nome;
    private String dataNascimento;
    private Telefone telefone;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;

        telefone = new Telefone();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public Telefone getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String ddd, String numero){
        telefone.setDdd(ddd);
        telefone.setNumero(numero);
    }
}
