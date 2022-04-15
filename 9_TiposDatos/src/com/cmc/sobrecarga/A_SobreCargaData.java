package com.cmc.sobrecarga;

public class A_SobreCargaData {
    public void m1(int x){
        System.out.println("int");
    }
    public void m1(Integer x){
        System.out.println("Integer");
    }
    public void m1(long x){
        System.out.println("long");
    }
    public void m1(short x){
        System.out.println("short");
    }
//    public void m1(double x){
//        System.out.println("double");
//    }

    public void m1(Object x){
        System.out.println("Object");
    }

    public void m1(Number x){
        System.out.println("Number");
    }
    // Numbre es el papa de Object
}
