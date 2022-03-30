package com.cmc.arreglosBidimencionales;

public class B_IteracionArreglosBidimencional {
    public static void main(String[] args) {
        //        Instancias de arreglo
        System.out.println("Iteracion Metodo 1");
        int arregloInt[][] = {{3, 2}, {8}, {46, 7}};
        for (int[] i : arregloInt) {
            for (int j : i) {
                System.out.println(j);
            }
        }

        System.out.println("\nIteracion Metodo 2");
        for(int i=0;i<arregloInt.length;i++){
            for(int j=0;j<arregloInt[i].length;j++){
                System.out.println(arregloInt[i][j]);
            }
        }
    }
}
