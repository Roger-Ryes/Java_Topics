package com.cmc.metodos;

public class D_MetodoSubString {
    public static void main(String[] args) {
        String cadena  = "Hola lenguaje java";
        String res = cadena.substring(2, 10);
        System.out.println(res);

        StringBuffer sb1 = new StringBuffer(3);
        sb1.append("Hola mundo java metodos comunes");
        String ret = sb1.substring(2, 10);
        System.out.println(ret);
    }
}
