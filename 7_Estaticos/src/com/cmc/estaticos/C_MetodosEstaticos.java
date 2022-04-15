package com.cmc.estaticos;

public class C_MetodosEstaticos {
    public static void metodoEstatico(){
        System.out.println("");
    }

    public void metodoSimple(){
        System.out.println("");
    }

    public static void main(String[] args) {
//        metodoSimple(); //Error Compilation, No puedo acceder al metodo si no es estatico

        metodoEstatico();
    }
}
