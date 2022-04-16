package com.cmc.operaciones;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class A_Operaciones {
    public static void main(String[] args) {
        System.out.println("LocalDate");
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        LocalDate ld2 = ld1.plusDays(20); // No modifica el locaDate origina, devuelve una nueva locaDate
        System.out.println("Days: "+ld2);
        LocalDate ld3 = ld1.plusMonths(12);
        System.out.println("Month: "+ ld3);
        LocalDate ld4 = ld1.plusYears(20);
        System.out.println("Year: "+ ld4);

        System.out.println("\nLocalDateTime");
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ld1);
        LocalDateTime ldt2 = ldt1.plusMonths(5);
        System.out.println("Months: "+ldt2);
        LocalDateTime ldt3 = ldt1.plusHours(9);
        System.out.println("Hours: "+ldt3);
        LocalDateTime ldt4 = ldt1.plusMinutes(120);
        System.out.println("Minutess: "+ldt4);

    }
}
