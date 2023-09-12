/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author rafap
 */
public class HourlyEmployee extends Employee {
    
    private double wage;
    private double hours;

    public HourlyEmployee(double wage, double hours, 
            String firstName, String listName, String socialSecurityNumber) {
        super(firstName, listName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    @Override
    public double earnings(){
        if(getHours() <= 40){
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    
    @Override
   public String toString(){
       return ("--- Relatorio ---\n" +
               super.toString()+ "\n" +
               "Quantidade de trabalhadas: " + getHours() + "\n" + 
               "Valor da hora trabalhada R$: " + getWage());
   }
   
}
