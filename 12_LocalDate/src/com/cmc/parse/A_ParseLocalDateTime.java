package com.cmc.parse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A_ParseLocalDateTime {
    public static void main(String[] args) {
        System.out.println("\nParse LocalDateTime");
        String dateTime1 = "2020-12-08T12:30";
        LocalDateTime ldt1 = LocalDateTime.parse(dateTime1); // ISO_DATE yyyy-MM-ddThh:mm
        LocalDateTime ldt2 = LocalDateTime.parse(dateTime1, DateTimeFormatter.ISO_DATE_TIME); // ISO_DATE yyyy-MM-ddT:hh:mm
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt1.getDayOfWeek()+" "+ldt1.getHour());

//        System.out.println("\n Parse Diseñado");
//        String dateTime2 = "2020/30/12 12:50:23";
//        LocalDateTime ldtDesign = LocalDateTime.parse(dateTime2, DateTimeFormatter.ofPattern("yyyy/dd/MM hh:mm:ss"));
//        System.out.println(ldtDesign);
    }
}
