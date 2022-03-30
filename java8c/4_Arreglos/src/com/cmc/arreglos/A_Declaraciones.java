package com.cmc.arreglos;

public class A_Declaraciones {
    public static void main(String[] args) {
//      Formas de declarar un arreglo
        int [] arreglo1;
        String [] arregloStr1;

        int arreglo2 [];
        String arregloStr2[];

//      NO se puede declarar el tamaño
//        int arregloSize [3];

//      Se debe instanciar el objeto con el tamaño
        arreglo1 = new int[5];

//      Declaracion de arreglos sin tamaño
        int [] arregloInt1 = {2,5,7,8};

//      Compilation fail | no es valido
//        String [] valor = new String[3]{"x","y","z"};

    }
}
