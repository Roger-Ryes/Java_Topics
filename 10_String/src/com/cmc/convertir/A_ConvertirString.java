package com.cmc.convertir;

public class A_ConvertirString {
    public static void main(String[] args) {
        StringBuffer val = new StringBuffer(5);
        val.append("Hola ");
        val.append("Mundo");
        System.out.println(val);

//        String con = val; // No es posible
        String con = val.toString();
        System.out.println(con);
    }

}
