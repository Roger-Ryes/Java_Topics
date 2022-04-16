package com.cmc.literals;

public class A_Test1 {
    public static void main(String[] args) {
        // Decimal
        int i1 = 100;

        // Octal
        int i2 = 04322;

        // Hexadecimal
        int i3 = 0xCaFe2;

        float f1 = 100_233_487.0f; // Uso de guion bajo para separar numeros
        float f2 = 0_0_487.0f;

        double d1 = 1_0_487.0d;
        System.out.println(f1);
        System.out.println(f2);
    }
}
