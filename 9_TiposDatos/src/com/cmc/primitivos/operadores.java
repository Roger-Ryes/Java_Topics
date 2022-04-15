package com.cmc.primitivos;

public class operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int num3 = 40;

        System.out.println("Suma");
        System.out.println(num1 + num2 + num3);

        // Cuando se junta un string, se concatena
        System.out.println("\nConcatenacion: "+num1 + num2 + num3);
        // Para que sume y concatene
        System.out.println("\nConcatenacionYSuma: "+(num1 + num2 + num3));

    }
}
