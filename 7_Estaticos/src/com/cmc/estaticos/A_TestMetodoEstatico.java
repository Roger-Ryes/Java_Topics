package com.cmc.estaticos;

public class A_TestMetodoEstatico {
    int valor;
    static int valueSta;
    public static void main(String[] args) {
//        valor = 100; // Sin apuntador en metodo estatico

        A_AtributosEstaticos ae = new A_AtributosEstaticos();
        ae.valor = 100; // Con apuntador en metodo estatico

        valueSta = 10; // Al ser estatico puedo acceder en metodo estatico
    }
}
