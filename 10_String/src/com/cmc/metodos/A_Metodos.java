package com.cmc.metodos;

public class A_Metodos {
    public static void main(String[] args) {
        System.out.println("STRING");
        // concat
        String cadena = "hola";
        String res = cadena.concat(" mundo");
        System.out.println(cadena);
        System.out.println(res);
        // replace
        res = cadena.replace("ol", "ar");
        System.out.println(res);


        System.out.println("\nSTRINGBUFFER");
        // Append
        StringBuffer sb1 = new StringBuffer("Hola");
        sb1.append(" mundo");
        sb1.append(new StringBuffer(" Test"));
        sb1.append(false);
        sb1.append(5);
        System.out.println(sb1);
        // replace
        sb1.replace(5,11, "perros de la calle "); //init: NoIncluida, end: Incluido
        System.out.println(sb1);
        // delete

    }
}
