package com.cmc.localDate;

import java.time.LocalDate;
import java.time.Month;

public class A_Instanciar {
    public static void main(String[] args) {
        // Local Date no tiene constructor accesible
        // First instance
        LocalDate ld = LocalDate.now();
        System.out.println(ld); // yyyy-MM-dd

        // Second instance
        ld = LocalDate.of(2020,8,20);
        System.out.println(ld);

        // Third instance
        ld = LocalDate.of(2020, Month.FEBRUARY, 18);
        System.out.println(ld);

        // Time Exception
        ld = LocalDate.of(2020, Month.FEBRUARY, 33);

    }
}
