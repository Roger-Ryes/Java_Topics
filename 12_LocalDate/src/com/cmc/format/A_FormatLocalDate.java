package com.cmc.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class A_FormatLocalDate {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2021, Month.MAY, 16);
        String ft1 = ld1.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String ft2 = ld1.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println(ft1);
        System.out.println(ft2);


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String fdesing = ld1.format(dtf1);
        System.out.println(fdesing);
    }
}
