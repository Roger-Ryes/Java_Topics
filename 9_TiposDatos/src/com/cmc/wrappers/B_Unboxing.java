package com.cmc.wrappers;

public class B_Unboxing {
    public static void main(String[] args) {
        Integer i1= 100; // Internamente i1 = new Integer(100)

        // unboxing Permite que se comporte como un primitivo
        int i2 = i1; // Unboxing | internamente i2 = i1.intValue();


        int i3 = i1.intValue();

        A_Wrappers wr = new A_Wrappers();
//        double i4 = wr.dw; // wr.dw.doubleValue()

        if(i1>10){
            System.out.println("Es mayor");
        }
        int x = 200+i1;
        System.out.println(x);
    }
}
