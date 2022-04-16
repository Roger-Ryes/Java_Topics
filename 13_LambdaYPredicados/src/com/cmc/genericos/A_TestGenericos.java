package com.cmc.genericos;

import java.util.ArrayList;
import java.util.List;

public class A_TestGenericos {
    public static void main(String[] args) {
        List<String> cadena = new ArrayList<>();
        cadena.add("uno");
        cadena.add("two");

        String result = cadena.get(0);
        System.out.println(result);


        List<Integer> enteros = new ArrayList<>();
        enteros.add(10);
        enteros.add(20);
        enteros.add(30);

        Integer res = enteros.get(0);
        System.out.println(res);
    }
}
