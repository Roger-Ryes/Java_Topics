package com.cmc.bucles;

public class D_Continue {
    public static void main(String[] args) {
//      Continue: sale del for pero no termina
        for(int i=0;i<5;i++){
            if(i==3){ continue; }
            System.out.println(i);
        }
    }
}
