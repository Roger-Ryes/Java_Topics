package com.cmc.arraylist;

import java.util.ArrayList;
import java.util.List;

public class B_Test1 {
    public static void main(String[] args) {
        List<B_Persona> personas = new ArrayList<B_Persona>();

        // En mi lista acepta a B_Cuidadano porque hereda de B_Persona
        personas.add(new B_Persona());
        B_Persona pb1 = personas.get(0);
        personas.add(new B_Cuidadano());

        // La interfaz al ser implementada en B_Persona, se puede agregar a la lista
        List<B_Reemplazable> lists = new ArrayList<>();
        lists.add(new B_Persona());
        lists.add(new B_Cuidadano());
//        lists.add(new B_Reemplazable()); // No es posible
    }
}
