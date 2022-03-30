package com.cmc.arreglos;

public class A_Ejercicio {
    public static void main(String[] args) {
        int [] arregloInt1 = new int[4];
        String arregloStr1 [] = new String[3];

//      Valores por defecto
        System.out.println("\nSin asignar valores");
        System.out.println("Valor arregloInt1[0]:"+arregloInt1[0]);
        System.out.println("Valor arregloStr1[0]:"+arregloStr1[0]);

//      Asignacion de elementos
        arregloInt1[0]=2;
        arregloStr1[0]="Hello";
        System.out.println("\nAsignando valores");
        System.out.println("Valor arregloInt1[0]:"+arregloInt1[0]);
        System.out.println("Valor arregloStr1[0]:"+arregloStr1[0]);
    }
}
