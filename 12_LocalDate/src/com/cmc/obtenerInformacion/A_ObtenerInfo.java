package com.cmc.obtenerInformacion;

import java.time.LocalDate;

public class A_ObtenerInfo {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        System.out.println("Year: "+ld1.getYear());
        System.out.println("Month: "+ld1.getMonth());
        System.out.println("MonthValue: "+ld1.getMonthValue());
        System.out.println("DayOfMonth: "+ld1.getDayOfMonth());
        System.out.println("DayOfYear: "+ld1.getDayOfYear());
        System.out.println("DayOfWeek: "+ld1.getDayOfWeek());
    }
}
