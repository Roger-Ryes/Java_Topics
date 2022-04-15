package com.cmc.tostring;

public class A_Test1 {
    public static void main(String[] args) {
        A_Persona person = new A_Persona("Juan", "LOpoez");

        System.out.println(person); // Decimal
        System.out.println(person.getClass().getCanonicalName());
        System.out.println(person.hashCode()); // Hexadecimal

        System.out.println("\n\nEjercicio 2");
        A_Persona [] persons = new A_Persona[2];
        persons[0] = new A_Persona("n1", "a1");
        persons[1] = new A_Persona("n2", "a2");
        System.out.println(persons); // Nos muestra el hash del arreglo ([L)
        System.out.println(persons[0]);
        System.out.println(persons[0].getNombre());
    }
}
