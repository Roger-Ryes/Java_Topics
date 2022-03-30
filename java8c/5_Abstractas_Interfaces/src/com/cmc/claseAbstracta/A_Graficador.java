package com.cmc.claseAbstracta;

public class A_Graficador {
    public void graficar(A_Figura figura){
        System.out.println("Color: "+figura.getColor());
        System.out.println("Perimetro: "+figura.calcularPerimetro()+"\n");
    }
}
