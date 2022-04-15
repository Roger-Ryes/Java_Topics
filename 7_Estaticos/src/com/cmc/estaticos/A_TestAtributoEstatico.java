package com.cmc.estaticos;

public class A_TestAtributoEstatico {
    public static void main(String[] args) {
        A_AtributosEstaticos.valorStatic = 10;

        A_AtributosEstaticos ae1 = new A_AtributosEstaticos();
        ae1.valor = 15; // No estatico, se ingresa por el apuntador

        A_AtributosEstaticos ae2 = new A_AtributosEstaticos();
        ae2.valor = 20;

        System.out.println(ae1.valorStatic+" v1: "+ ae1.valor);
        System.out.println(ae2.valorStatic+" v2: "+ ae2.valor);
        System.out.println(A_AtributosEstaticos.valorStatic);

        System.out.println("\n");
        ae1.add();
        System.out.println("v1: "+ae1.valor);
        ae2.add();
        System.out.println("v2: "+ae2.valor);
    }
}
