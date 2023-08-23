/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controledeponto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rafap
 */
public class ControlePonto {
    
    public void registrarEntrada(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("Entrada: " + f.getCodigo() + " às " + sdf.format(agora));        
    }

    public void registrarSaida(Funcionario f){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date agora = new Date();

        System.out.println("Saída: " + f.getCodigo() + " às " + sdf.format(agora));        
    }
}
