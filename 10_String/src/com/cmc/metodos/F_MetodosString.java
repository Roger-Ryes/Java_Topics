package com.cmc.metodos;

public class F_MetodosString {
    public static void main(String[] args) {
        System.out.println("String".toUpperCase());

        String cadena = " Hola Mundo ";

        System.out.println(cadena);
        // Trim
        System.out.println(cadena.trim());
        // isEmpty
        System.out.println(cadena.isEmpty());
        String cadena2 = "";
        System.out.println(cadena2.isEmpty());

        String cadena3 = " hOla mUndo ";
        if(cadena.equals(cadena3)){
            System.out.println("Son iguales con 'equals'");
        }
        if(cadena.equalsIgnoreCase(cadena3)){
            System.out.println("Son iguales con 'equalsIgnoreCase'");
        }
    }
}
