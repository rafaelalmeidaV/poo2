package com.mycompany.projetoaula26_09;

public class Triangulo  implements FiguraGeometrica{
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;
   
    
    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
    }

    @Override
    public String getNomeFigura() {
        return "Triangulo";
    }

    @Override
    public double getArea() {
        return (base * altura)/2;
    }

    @Override

    public double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    

    
}
