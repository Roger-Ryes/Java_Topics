package com.cmc.metodos;

public class E_MetodoEquals {
    public static void main(String[] args) {
        // ==
        // equals

        String a = "abc";
        String b = "d";
        String c = a+b;
        System.out.println(c);

        String nuevo ="abcd";
        System.out.println(nuevo);

        if(c==nuevo){
            System.out.println("Iguales con '=='");
        }
        if(c.equals(nuevo)){ // En lugar de comparar referencias, compara contenido
            System.out.println("Iguales con 'equals'");
        }


        System.out.println("\nStringBuilder".toUpperCase());
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        if(sb1==sb2){
            System.out.println("Iguales con '=='");
        }
        if(sb1.equals(sb2)){
            System.out.println("Iguales con '=='");
        }
    }
}
