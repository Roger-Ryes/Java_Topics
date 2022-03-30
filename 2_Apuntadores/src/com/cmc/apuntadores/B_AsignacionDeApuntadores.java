package com.cmc.apuntadores;

public class B_AsignacionDeApuntadores {
    public static void main(String[] args) {
        A_Persona p1 = new A_Persona();
        A_Persona p2 = new A_Persona();

        p1.nombre = "Artur";
        p1.edad = 21;

        p2.nombre = "Tommy";
        p2.edad = 18;
        p2.estatura = 1.70;

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        p1 = p2;

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
