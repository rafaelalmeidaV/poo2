/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao1_lista2;

/**
 *
 * @author rafap
 */
public class Questao1_Lista2 {

    public static void main(String[] args) {
        
        Automovel automovel = new Automovel();
        Bicicleta bicicleta = new Bicicleta();
        
        automovel.ajusta();
        automovel.limpar();
        automovel.listarVerificador();
        
        bicicleta.ajusta();
        bicicleta.limpar();
        bicicleta.listarVerificador();
    }
}
