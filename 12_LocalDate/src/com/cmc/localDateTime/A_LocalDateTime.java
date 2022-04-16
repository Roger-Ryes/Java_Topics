package com.cmc.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class A_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime no tiene un constructor
        // First intance
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1); // yyyy-MM-ddThh:mm:ss.ms

        // Second instance
        LocalDateTime ldt2 = LocalDateTime.of(2020,3,15,3,50);
        System.out.println(ldt2); // yyyy-MM-ddThh:mm

        // Third instance
        LocalDateTime ldt3 = LocalDateTime.of(2021, Month.AUGUST,26,8,00, 50, 4);
        System.out.println(ldt3); // yyyy-MM-ddThh:mm:ss.ms
    }
}
