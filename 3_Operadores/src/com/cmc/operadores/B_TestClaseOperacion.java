package com.cmc.operadores;

public class B_TestClaseOperacion {
    public static void main(String[] args) {
        B_ClaseOperacion inc = new B_ClaseOperacion();
        int x = 4;
        inc.Mostrar(x--);
        //x=3
        System.out.println("x: "+x);
        inc.Mostrar(x--);
        System.out.println("x: "+x);
    }
}
