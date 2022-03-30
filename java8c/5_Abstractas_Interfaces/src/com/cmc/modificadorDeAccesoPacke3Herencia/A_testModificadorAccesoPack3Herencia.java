package com.cmc.modificadorDeAccesoPacke3Herencia;

import com.cmc.modificadorDeAcceso.A_modificadorDeAcceso;

public class A_testModificadorAccesoPack3Herencia extends A_modificadorDeAcceso{
    public void probarAccesos(){
        A_modificadorDeAcceso conten = new A_modificadorDeAcceso();
//        conten.varDefault = 0;      // No se accede porque esta en otro packete
//        conten.varProtected = 0;    // Se puede acceder porque se lo hereda
        varProtected = 0;
//        conten.varPublic =0;        // Se puede acceder siempre
        varPublic = 0;
//        conten.varPrivate = 0;      // No se puede usar, no se tiene accesi
    }
}
