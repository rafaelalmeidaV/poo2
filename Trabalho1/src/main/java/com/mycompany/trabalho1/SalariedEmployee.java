/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1;

/**
 *
 * @author rafap
 */
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName,
            String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public String toString(){
        return ("---Relatorio---\n" + super.toString() + "\n" + "Salario semanal: R$ " +getWeeklySalary());
    }
        
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    
}
