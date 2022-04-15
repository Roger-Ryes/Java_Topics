package com.cmc.flujoExceptiones;

import java.util.Locale;

public class A_flujoException {
    public static void main(String[] args) {
        String value = "";
        String num[] = {"1"};
        try {
            System.out.println("Start");
            value.toLowerCase();
            num[1] = "2";
            System.out.println("End");
        } catch (NullPointerException ex) {
            System.out.println("Execute catch");
            ex.printStackTrace();
        } catch (Exception ex){
            System.out.println("Execute catch General");
            ex.printStackTrace();
        } finally {
            // Siempre entra al "finally", con o sin exception
            System.out.println("Entro al finally");
        }

        System.out.println("End code");

//        El orden de la exceptiones influye, Primero van los hijos, luego los padres
//        Incorrecto
//        try {
//            System.out.println("Start");
//            value.toLowerCase();
//            num[1] = "2";
//            System.out.println("End");
//        } catch (Exception ex){
//            System.out.println("Execute catch General");
//            ex.printStackTrace();
//        } catch (NullPointerException ex) {
//            System.out.println("Execute catch");
//            ex.printStackTrace();
//        }
    }
}
