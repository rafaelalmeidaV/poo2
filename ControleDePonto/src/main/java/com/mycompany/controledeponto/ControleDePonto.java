/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controledeponto;

/**
 *
 * @author rafap
 */
public class ControleDePonto {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente();
        f1.setCodigo(1);

        ControlePonto controle_Ponto = new ControlePonto();
        controle_Ponto.registrarEntrada(f1);
        controle_Ponto.registrarSaida(f1);

        Funcionario f2 = new Telefonista();
        f2.setCodigo(2);

        controle_Ponto.registrarEntrada(f2);
        controle_Ponto.registrarSaida(f2);
        

    }
}
