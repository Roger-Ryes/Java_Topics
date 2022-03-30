package com.cmc.claseAbstracta;

public class TestGraficador {
    public static void main(String[] args) {
        A_Graficador gr = new A_Graficador();
        gr.graficar(new A_Cuadrado(4,"Green"));
        gr.graficar(new A_Triangulo(4,5,6,"BLue"));
    }
}