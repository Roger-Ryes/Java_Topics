package com.cmc.primitivos;

public class castingDePrimitivos {
    public static void main(String[] args) {
        byte by = 0;
        int in = 100;
        float fl = 20;

        // NO es posible por tamaños
//        by = in;
        // Se castea
        by = (byte)in;
        fl = (float)100.1;
        System.out.println(by);
    }
}
