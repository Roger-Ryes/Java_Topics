package com.cmc.arreglosBidimencionales;

public class A_ArregloBidimencional {
    public static void main(String[] args) {
        int [] arregloInt1[];
        int [][] arregloInt2;
        int arregloInt3 [][];

//        Posibles Instancias del objeto
        System.out.println("Instancia objeto arregloInt1");
        arregloInt1 = new int[2][]; // 2 celdas y 1 celda
        System.out.println("\tIndex1: "+arregloInt1.length);

        System.out.println("Instancia objeto arregloInt2");
        arregloInt2 = new int[2][3];
        System.out.println("\tIndex1: "+arregloInt2.length);
        System.out.println("\tIndex2: "+arregloInt2[0].length);



//        Imposibles Instancias del objeto
//        arregloInt3 = new int[][];  // En posicion 1, si indicar tamaño
//        arregloInt3 = new int[][3];

//        Instancias de arreglo
        int arregloInt4[][]={{3,2},{8},{46,7}};
        System.out.println("\nInstancias de arreglo");
        System.out.println(arregloInt4[0][0]);
        System.out.println(arregloInt4[1][0]);

    }
}
