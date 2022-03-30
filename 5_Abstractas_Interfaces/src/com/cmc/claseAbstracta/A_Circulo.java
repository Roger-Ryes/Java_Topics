package com.cmc.claseAbstracta;

public class A_Circulo extends A_Figura{
    private int radio;
    public A_Circulo(int radio, String color){
        super(color);
        this.radio = radio;
    }

    public double calcularPerimetro(){
        return 2*Math.PI*this.radio;
    }
}
