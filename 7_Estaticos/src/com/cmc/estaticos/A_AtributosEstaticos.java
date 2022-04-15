package com.cmc.estaticos;

public class A_AtributosEstaticos {
    int valor; // No Estatico
    static int valorStatic;

    void add(){
        valor++;
    }

    static void addStatic(){
        // Error de compilacion
//        valor++; // Este atributo esta en el objeto instanciado, no en la clase
    }
}
