package com.mycompany.projetoaula26_09;

public class Quadrado implements FiguraGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }
    
    @Override
    public double getArea() {
        return lado * lado;
    }
    
    @Override
    public double getPerimetro() {
        return 4 * lado;
    }
}
