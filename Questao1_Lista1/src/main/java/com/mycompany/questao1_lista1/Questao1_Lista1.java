/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.questao1_lista1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafap
 */
public class Questao1_Lista1 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int resultado;
        int soma =0 ;
        int maior = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("digite um numero");
            int num = sc.nextInt();

            numeros.add(num);

            if (num > maior) {
                maior = num;
            }
            soma = soma + numeros.get(i);
        }
        resultado = soma * maior;
        System.out.println("Resultado " + resultado);
    }
}
