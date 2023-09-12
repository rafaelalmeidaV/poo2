/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2_lista1;

/**
 *
 * @author rafap
 */
public class Fatorial {

    int resultado = 1;

    public int fatorial(int num) {
        for (int i = num; i > 0; i--) {
            if (i != 0) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }

}
