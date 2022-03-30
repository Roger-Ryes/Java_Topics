package com.cmc.arreglos;

public class C_Iteracion {
    public static void main(String[] args) {
        int arreglo [] = {2,5,87,5};
//        Iteracion metodo 1
        System.out.println("\nIteracion metodo 1");
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }

//        Iteracion metodo 2
        System.out.println("\nIteracion metodo 2");
        for (int i:arreglo){
            System.out.println(i);
        }
    }
}
