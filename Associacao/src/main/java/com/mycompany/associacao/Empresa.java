/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.associacao;

import java.util.ArrayList;

/**
 *
 * @author rafap
 */
public class Empresa {

    private String nome;
    private String cnpj;
    private String endereco;

    private ArrayList<Funcionario> funcionario = new ArrayList<>();

    public Empresa(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFuncionario(Funcionario func) {
        funcionario.add(func);
    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void gerarRelatorio() {
        System.out.println("--------- DADOS DA EMPRESA ------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Endereco: " + getEndereco());

        System.out.println("----- Funcionario da Empresa ------");

        for (int i = 0; i < funcionario.size(); i++) {
            System.out.println("Nome: " + funcionario.get(i).getNome());
            System.out.println("CPF: " + funcionario.get(i).getCpf());
            System.out.println("cargo: " + funcionario.get(i).getCargo());
            System.out.println("salario: " + funcionario.get(i).getSalario());
        }
    }

}
