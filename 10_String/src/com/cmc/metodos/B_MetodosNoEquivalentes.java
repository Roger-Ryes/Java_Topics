package com.cmc.metodos;

public class B_MetodosNoEquivalentes {
    public static void main(String[] args) {
        System.out.println("STRING");
        String cadena = "hola";

        System.out.println("\nSTRINGBUFFER");
        StringBuffer sb1 = new StringBuffer("Hola mundo programer");
        // delete
        sb1.delete(5, 10);
        System.out.println(sb1);
        // Insert
        sb1.insert(6, "COLADO");
        System.out.println(sb1);
        // reverse
        sb1.reverse();
        System.out.println(sb1);
    }
}
