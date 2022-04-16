package com.cmc.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A_FormatLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        String fld1 = ldt1.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(fld1);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss MMMM yyyy");
        String fdesigner= ldt1.format(dtf1);
        System.out.println(fdesigner);
    }
}
