package com.cmc.tratarExceptions;

import com.cmc.lanzarException.A_Lanzar;

public class A_TratarException {
    public void tryExceptionOne() {
        // try-catch, First method
        A_Lanzar thr = new A_Lanzar();
        try{
            thr.throwExceptionOne(20);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void tryExceptionTwo() throws Exception {
        // spread this exception, First method
        A_Lanzar thr = new A_Lanzar();
        thr.throwExceptionOne(20);
    }

    public void inheritException() throws B_heredarException{ // Or throws Exception
        throw new B_heredarException();
    }
}
