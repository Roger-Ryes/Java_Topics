package com.cmc.arraylist;

import java.util.ArrayList;
import java.util.List;

public class C_Test1 {
    public static void main(String[] args) {
        B_Persona p = new B_Persona("Mac");
        List<B_Persona> personas = new ArrayList<>();

        personas.add(new B_Persona("Will"));
        personas.add(p);
        personas.add(null);
        personas.add(new B_Persona("Este"));
        personas.add(null);

        System.out.println(personas);
        B_Persona perDel = personas.remove(0);

        System.out.println(perDel);
        System.out.println(personas);

        boolean res = personas.remove(new B_Persona("Este")); // No lo va a encontrar porque esta apuntando a otro objeto
        System.out.println(res);
        res = personas.remove(p); // Si lo va a encontrar porque esta apuntando al objeto
        System.out.println(res);
        System.out.println(personas);
    }
}
