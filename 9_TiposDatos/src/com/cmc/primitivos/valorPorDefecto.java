package com.cmc.primitivos;

public class valorPorDefecto {
        byte by;     // 0
        short sh;    // 0
        int in;      // 0
        long lo;     // 0

        float fl;    // 0.0
        double db;   // 0.0

        char ch;     // u0000 "Espacio en blanco"

        boolean bl; // false


    public static void main(String[] args) {

        valorPorDefecto value = new valorPorDefecto();
        System.out.println(value.by +" "+value.sh +" "+value.in +" "+value.lo +" "+value.fl +" "+value.db +" "+value.ch +" "+value.bl);
    }
}
