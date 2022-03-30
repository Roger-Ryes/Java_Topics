package com.cmc.herencia;

public class B_TestReferencias {
    public static void main(String[] args) {
        // Referencias
        Object obj = new A_Perro();
        A_Animal ani = new A_Animal();
        A_Perro perr = new A_Perro();

        // La clase Object, solo tiene metodos de la clase Object
//        obj.ladrar();     // Metodo de A_Perro (No valido)
        obj.toString();     // Metodo de Object
//        obj.dormir();     // Metodo de A_Animal (No valido)


        // La clase A_Animal, solo tiene metodos de la clase A_animal y de Object
        ani.hashCode();     // Metodo de Object
        ani.dormir();       // Metodo de A_Animal
//        ani.ladrar();       // Metodo de A_Perro (No valido)


        // La clase A_Perro, solo tiene metodos de la clase A_Perro, A_animal y de Object
        perr.ladrar();      // Metodo de A_Perro
        perr.hashCode();    // Metodo de Object
        perr.dormir();      // Metodo de A_Animal
    }
}
