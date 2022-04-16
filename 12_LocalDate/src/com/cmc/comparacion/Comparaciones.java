package com.cmc.comparacion;

import java.time.LocalDate;

public class Comparaciones {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2020, 12, 4);
        LocalDate ld2 = LocalDate.of(2021, 12, 4);
        LocalDate ld3 = LocalDate.of(2020, 12, 4);

        if(ld1.isAfter(ld2)){
            System.out.println("Ld1 esta despues de ld2");
        }
        if(ld2.isAfter(ld1)){
            System.out.println("Ld2 esta despues de ld1");
        }
        if(ld1.isEqual(ld3)){
            System.out.println("Son iguales");
        }
        if(ld1.equals(ld3)){
            System.out.println("Son iguales con equals");
        }
    }
}
