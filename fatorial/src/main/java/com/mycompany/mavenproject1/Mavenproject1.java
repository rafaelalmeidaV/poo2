/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.CalcFatorial.calcularFatorial;
import java.util.Scanner;

/**
 *
 * @author rafap
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o numero desejado");
        n1 = sc.nextInt();
        
        calcularFatorial(n1);

        System.out.println("O fatorial de " + n1 + " é " + calcularFatorial(n1));
        
    }
}
