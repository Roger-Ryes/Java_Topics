package com.cmc.arraylist;

import java.util.ArrayList;
import java.util.List;

public class A_Test2 {
    public static void main(String[] args) {
        List<String> value = new ArrayList<>();
        value.add("one");
        value.add("two");
        value.add(null);
        value.add("three");

        int posic = value.indexOf("two");
        System.out.println(posic);
         posic = value.indexOf("four");
        System.out.println(posic);
    }
}
