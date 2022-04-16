package com.cmc.parse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A_ParseLocalDate {
    public static void main(String[] args) {
        System.out.println("Parse LocalDate");
        String date1 = "2021-10-20";
        String date2 = "20211020";
        LocalDate ld = LocalDate.parse(date1); // ISO_DATE yyyy-MM-dd
        LocalDate ld2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE); // ISO_DATE yyyy-MM-dd
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println(ld.getDayOfWeek()+" "+ld.getMonth());

        System.out.println("\nParse DISEÑADO");
        String dateDesig = "2020/01/12";
        LocalDate ldDesig = LocalDate.parse(dateDesig, DateTimeFormatter.ofPattern("yyyy/dd/MM"));
        System.out.println(ldDesig);
    }
}
