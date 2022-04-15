package com.cmc.sobrecarga;

public class A_TestSobreCargaData {
    public static void main(String[] args) {
        int x = 100;
        long y = 100;
        double z = 100;
        A_SobreCargaData a_sobre = new A_SobreCargaData();
        a_sobre.m1(x);
        a_sobre.m1(y);
        a_sobre.m1(z);
    }
}
