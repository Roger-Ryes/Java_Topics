package com.cmc.interfacesEimplementacion;

public class B_TestLambdaDescartar {
    public static void main(String[] args) {
        A_AdminAnimal aa = new A_AdminAnimal();

        // Lambda
        aa.alimentar(()->{
            System.out.println("Leon comiendo");
        });

        aa.delete((int x)->{
            System.out.println("Descartar: "+ x);
        });
        // Posibilidades
        aa.delete(z->{
            System.out.println("Descartar: "+ z);
        });
        // No posible
//        aa.delete(int w->{
//            System.out.println("descartar "+ w);
//        });


        aa.reemplazado((int valor)->{
            return valor>5;
        });
        aa.reemplazado(valor -> valor>7);
    }
}
