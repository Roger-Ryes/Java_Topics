package com.cmc.stringBuffer;

public class A_CreacionSB {
    public static void main(String[] args) {
//        StringBuffer sb = "asd"; // NO se puede, se debe instanciar
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // CUantos caracteres estan reservados inicialmente
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Hola mundo");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer(5);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity()); // Capacidad inicial 5
        System.out.println(sb3);

    }
}
