package com.cmc.tostring;

public class A_Test2 {
    public static void main(String[] args) {
        A_Persona p1 = new A_Persona("Aura", "Zuli");
        A_Persona p2 = new A_Persona("Aura", "Zuli");
        A_Persona p3 = p1;

        if(p1.equals(p2)){ // p1==p2
            System.out.println("Son Iguales");
        }else {
            System.out.println("Diferentes");
        }
        if(p1.equals(p3)){ // p1==p2
            System.out.println("Son Iguales");
        }else {
            System.out.println("Diferentes");
        }

        // Dos referencias son iguales comparadas con ==  si y solo
        // si apuntan al mismo objeto
        // El equals esta programado en Object para hacer lo mismo que ==
    }
}
