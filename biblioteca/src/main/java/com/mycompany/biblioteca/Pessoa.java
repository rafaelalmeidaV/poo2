/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author rafap
 */
public class Pessoa {
      private String nome;
     private String datadeNascimento;
     private Telefone telefone;
     private ArrayList livros;

    public Pessoa(String nome, String datadeNascimento, Telefone telefone, ArrayList livros) {
        this.nome = nome;
        this.datadeNascimento = datadeNascimento;
        this.telefone = telefone;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getTelefone() {
        return "(" + telefone.getDdd() +  ")" + telefone.getNumero();
    }

    public void setTelefone( String ddd, String num) {
        telefone.setDdd(ddd);
        telefone.setNumero(num);
    }

    public ArrayList getLivros() {
        return livros;
    }

    public void setLivros(ArrayList livros) {
        this.livros = livros;
    }
     
     
}
