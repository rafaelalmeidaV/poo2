/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agregacao;

/**
 *
 * @author rafap
 */
public class Agregacao {

    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("João", "01/01/1990");

        // Configurando o número de telefone da pessoa
        pessoa.setTelefone("11", "123456789");

        // Exibindo informações da pessoa
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Telefone: (" + pessoa.getTelefone().getDdd() + ") " + pessoa.getTelefone().getNumero());
    }
}
