package com.cmc.operadores;

public class C_OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador Ternario");
        int x = 10;
        String a = (x>10)?"Mayor":"Menor o Igual";
        System.out.println("\t"+a);

        System.out.println("\nEjercicio 2");
        int edad1= 50;
        String tipo = (edad1>50)?"Adulto Mayor":"Joven";
        System.out.println("\t"+tipo);

        System.out.println("\nEjercicio 3");
        int edad2= 18;
        String tipo2 =  (edad2>50)?"Adulto MAyor":
                        (edad2>18 && edad2<=50)?"Adulto":"Menor de edad";
        System.out.println("\t"+tipo2);
    }
}
