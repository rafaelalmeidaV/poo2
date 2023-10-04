/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula03_10_exeption;

/**
 *
 * @author rafap
 */
public class Aula03_10_Exeption {

    public static void main(String[] args) {
        
        Classe1 c1 = new Classe1(100);
        //Classe1 c1 = new Classe1(102);
        
        try{
            c1.f(200);
            //c1.f(-20);
            //c1.f(10);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Terminou o metodo f()");
        }
    }
}
