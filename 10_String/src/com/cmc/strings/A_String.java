package com.cmc.strings;

public class A_String {
    public static void main(String[] args) {
        String a = "abc";
        String result = a.toUpperCase(); // Devuelve una nueva cadena

        System.out.println(result);
        System.out.println(a.concat(result));
        System.out.println(a);


        StringBuffer abuffer = new StringBuffer("xyz");

        System.out.println(abuffer.append("a"));
        System.out.println(abuffer);
    }
}
