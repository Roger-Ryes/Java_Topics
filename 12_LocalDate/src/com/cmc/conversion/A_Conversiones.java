package com.cmc.conversion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class A_Conversiones {
    public static void main(String[] args) {
        // Convert LocalDate to LocalDateTime
        System.out.println("LocalDate to LocalDateTime");
        LocalDate ld1 = LocalDate.of(2021, Month.DECEMBER,10);
        System.out.println(ld1);

        // First Method
        LocalDateTime ldtConver = ld1.atStartOfDay();
        System.out.println(ldtConver);

        // Second Method
        LocalDateTime ldtConver2 = ld1.atTime(12, 30);
        System.out.println(ldtConver2);

        // Convert LocalDateTime to LocalDate
        System.out.println("\nLocalDateTime to LocalDate");
        LocalDateTime ldt1 = LocalDateTime.of(2020,Month.APRIL, 15, 23, 00);
        System.out.println(ldt1);

        LocalDate ldConvert = ldt1.toLocalDate();
        System.out.println(ldConvert);

        // Convert LocalDateTime to LocalTime
        System.out.println("\nLocalDateTime to LocalTime");
        LocalTime ltConvert = ldt1.toLocalTime();
        System.out.println(ltConvert);


    }
}
