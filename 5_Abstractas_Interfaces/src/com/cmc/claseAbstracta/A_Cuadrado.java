package com.cmc.claseAbstracta;

public class A_Cuadrado extends A_Figura{
    private int lado;

    public A_Cuadrado(int lado, String color){
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*this.lado;
    }
}
