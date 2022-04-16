package com.cmc.arraylist;

import java.util.ArrayList;
import java.util.List;

public class A_Test3 {
    public static void main(String[] args) {
        List<String> value = new ArrayList<>();
        value.add("one");
        value.add("two");
        value.add(null);
        value.add("three");
        value.add(null);
        System.out.println(value);

        String removed = value.remove(0);
        System.out.println(removed);
        System.out.println(value);

        boolean isRemoved = value.remove(null);
        System.out.println(isRemoved);
        System.out.println(value);
    }
}
