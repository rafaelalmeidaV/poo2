/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula03_10_exeption;

/**
 *
 * @author rafap
 */
public class Classe1 {
        private int valor;
        
        public Classe1(int n){
            valor = n;
        }
        
        public void f(int x) throws Exception, ArithmeticException {
            
            if(x<0)
                  throw new Exception("Erro - Argumento Negativo" + x);
            
            System.out.println(x/(valor - 100));
        }
}
