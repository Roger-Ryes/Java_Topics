package com.cmc.interfacesEimplementacion;

public class A_TestAdminAnimal {
    public static void main(String[] args) {
        A_AdminAnimal aa = new A_AdminAnimal();
        aa.alimentar(new A_Perro());
        aa.alimentar(new A_Gato());

        // Lambda
        aa.alimentar(()->{
            System.out.println("Leon comiendo");
        });
    }
}
