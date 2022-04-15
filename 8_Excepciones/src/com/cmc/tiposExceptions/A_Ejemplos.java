package com.cmc.tiposExceptions;

import java.io.File;

public class A_Ejemplos {
    public static void main(String[] args) {
        // Exception one
        try{
            System.out.println("Exception ArrayIndexOutOfBoundsException:");
            Integer[] arr = new Integer[2];
            arr[100]= 20;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            // Exception two
            System.out.println("\nException NullPointerException");
            String value = null;
            value.trim(); // NullPointerException
        }
        try{
            File f = new File("checked.txt");
//            f.createNewFile(); // IOException, CHECKED
        }catch (Exception e){

        }


    }
}
