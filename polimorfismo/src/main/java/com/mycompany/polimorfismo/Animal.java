package com.mycompany.polimorfismo;

public class Animal {
    private String nome;
    private float peso;

    public Animal(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void Dormindo(){
        System.out.println("Dormindo");
    }

    public void fazendoBarulho(){
        System.out.println("Fazendo barulho");
    }
}
