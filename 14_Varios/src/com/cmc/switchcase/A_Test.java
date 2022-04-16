package com.cmc.switchcase;

public class A_Test {
    public static void main(String[] args) {
        int day=3;
        String nameDay="";

        switch(day){
            case 1: nameDay="MONDAY"; break;
            case 2: nameDay="TURSDAY"; break;
            default: nameDay = "None"; break;
            case 3: nameDay="WEDNESDAY"; break;
            case 4: nameDay="MONDAY"; break;
        }

        System.out.println(nameDay);
    }
}
