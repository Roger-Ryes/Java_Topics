package com.cmc.interfaceClass;

import com.cmc.herencia.A_Animal;
import com.cmc.herencia.A_Perro;

// Solo se puede llamar a una clase, no a dos
// public class B_Paisaje extends A_Animal, A_Perro {

// Puedo llamar a varias interfaces
public class B_Paisaje extends A_Animal implements A_Dibujable, A_Lavable {
    // Llama a los metodos de cada interface
    @Override
    public void dibujar() {

    }

    @Override
    public void lavar() {

    }
}
