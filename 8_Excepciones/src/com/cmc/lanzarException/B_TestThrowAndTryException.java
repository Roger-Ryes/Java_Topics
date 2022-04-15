package com.cmc.lanzarException;

import static java.lang.Math.*;

public class B_TestThrowAndTryException {

    public void throwAndTryException() throws Exception{
        Double r = random()*10;
        Exception exc = (r<5)? new Exception(): new RuntimeException();
        throw exc;
    }

//    public void throwAndTryExceptionTwo() throws RuntimeException{ // No valido, por que puede ser Exception
//        Double r = random()*10;
//        throw  (r<5)? new Exception(): new RuntimeException();
//    }
}
