package com.cmc.metodos;

public class C_MetodosComunes {
    public static void main(String[] args) {
        System.out.println("METODOS COMUNES\n");
        System.out.println("STRING BUFFER");

        StringBuffer sb1 = new StringBuffer("Hola mundo java metodos comunes");

        // CharAt
        System.out.println(sb1.charAt(9));
        // IndexOF
        System.out.println(sb1.indexOf("do"));
        System.out.println(sb1.indexOf("do", 12));
        // length
        System.out.println(sb1.length());


        System.out.println("\nSTRING");
        String test = "Hola mundo java metodos comunes";

        // CharAt
        System.out.println(test.charAt(9));
        // IndexOF
        System.out.println(test.indexOf("do"));
        System.out.println(test.indexOf("do", 12));
        // length
        System.out.println(test.length());

    }
}
