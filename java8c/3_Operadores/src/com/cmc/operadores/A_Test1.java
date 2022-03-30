package com.cmc.operadores;

public class A_Test1 {
    public static void main(String[] args) {
        int x1 = 10;
        int z1 = x1++; // Primero asigna, luego incrementa
        System.out.println("x1: "+x1);
        System.out.println("z1: "+z1);
        System.out.println("x1: "+x1);
        System.out.println("");
        int x2 = 10;
        int z2 = ++x2; // Primero incrementa, luego asigna
        System.out.println("x2: "+x2);
        System.out.println("z2: "+z2);
        System.out.println("x2: "+x2);

        System.out.println("");
    }
}
