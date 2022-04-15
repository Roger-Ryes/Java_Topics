package com.cmc.lanzarException;

public class A_TestLanzar {
    public static void main(String[] args) {
        A_Lanzar thr = new A_Lanzar();
//        thr.throwExceptionOne(20); // Lanzara una exception, hacer algo
        thr.throwExceptionTwo(20); // Lanzara una exception, no exige hacer algo
    }
}
