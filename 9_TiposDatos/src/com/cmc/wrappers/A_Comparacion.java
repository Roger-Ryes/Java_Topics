package com.cmc.wrappers;

public class A_Comparacion {
    public static void main(String[] args) {
        Integer i1 = 1200;
        Integer i2 = 1200;
        // No apuntan al mismo objeto
        if(i1==i2){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }

        // Usar equals a usar wrappers
        if(i1.equals(i2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
    }
}
