package com.cmc.herencia;

public class A_TestAnimal {
    public static void main(String[] args) {
        A_Animal a = new A_Animal();
        a.dormir(); // Metodos de A_Animal
        a.hashCode(); // Metodos de A_Animal

        A_Perro perro = new A_Perro();
        perro.dormir(); // Metodos de A_Animal
        perro.hashCode(); // Metodos de A_Animal
        perro.ladrar(); // Metodos de A_Perro
    }
}
