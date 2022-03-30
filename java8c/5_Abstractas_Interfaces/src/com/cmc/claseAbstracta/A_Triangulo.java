package com.cmc.claseAbstracta;

public class A_Triangulo extends A_Figura{
    int lado1;
    int lado2;
    int lado3;

    public A_Triangulo(int lado1,int lado2, int lado3, String color){
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }
}
