package com.cmc.arraylist;

import java.util.ArrayList;
import java.util.List;

public class A_Test1 {
    public static void main(String[] args) {
        // En array list acepta null
        List<String> value = new ArrayList<>();
        value.add("one");
        value.add("two");
        value.add(null);
        value.add("three");

        System.out.println(value);
        System.out.println(value.size());
        System.out.println(value.get(2));
    }
}
