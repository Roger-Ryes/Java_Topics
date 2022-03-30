package com.cmc.sobreescritura;

import com.cmc.herencia.A_Animal;
import com.cmc.herencia.A_Perro;
import com.cmc.herencia.C_Gato;

public class TestApuntadores {
    public static void main(String[] args) {
        A_Animal a_animal = new A_Perro();
        a_animal.dormir(); // Imprime el metodo al objeto que estamos apuntando (A_Perro)

        a_animal = new C_Gato(); // Ahorra apunta al objeto (C_Gato)
        a_animal.dormir();
    }
}
