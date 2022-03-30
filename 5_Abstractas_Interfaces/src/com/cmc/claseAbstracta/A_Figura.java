package com.cmc.claseAbstracta;

// Si la clase tiene un metodo "abstract", entonces toda la clase debe ser "abstract"
public abstract class A_Figura {
    private String color;

    public A_Figura(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    // Clase abstracta, metodo solo la firma y no el cuerpo (Dentro de {})
//    public int calcularPerimetro(){
//        return 0;
//    }
    public abstract double calcularPerimetro();
}
