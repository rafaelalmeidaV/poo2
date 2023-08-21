/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculavetor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafap
 */
public class CalculaVetor {

    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        HandleVector handleVector = new HandleVector(v1);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor: ");
            handleVector.vector.add(sc.nextInt());
        }

        System.out.println("O maior valor do vetor é: " + handleVector.retornaMaior(handleVector.vector));

    }

}
