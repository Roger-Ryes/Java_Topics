package com.cmc.arreglos;

public class B_Asignacion {
    public static void main(String[] args) {
        String arrStr1 [] = new String[1];
        String arrStr2 [] = {"a","b","c"};

        arrStr1 = arrStr2;

        System.out.println(arrStr2[1]);
        System.out.println(arrStr1[1]);

    }
}
