package com.cmc.lanzarException;

public class A_Lanzar {
    public void throwExceptionOne(int x) throws Exception{
        if (x<0){
            throw new Exception(); // Checked
        }
    }

    public void throwExceptionTwo(int y) {
        if (y<0){
            throw new RuntimeException(); // Unchecked
        }
    }
}
