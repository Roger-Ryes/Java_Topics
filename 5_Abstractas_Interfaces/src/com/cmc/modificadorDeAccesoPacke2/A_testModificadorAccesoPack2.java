package com.cmc.modificadorDeAccesoPacke2;

import com.cmc.modificadorDeAcceso.A_modificadorDeAcceso;

public class A_testModificadorAccesoPack2 {
    public void probarAccesos(){
        A_modificadorDeAcceso conten = new A_modificadorDeAcceso();
//        conten.varDefault = 0;      // No se accede porque esta en otro packete
//        conten.varProtected = 0;    // Similar a Default
        conten.varPublic =0;        // Se puede acceder siempre
//        conten.varPrivate = 0;      // No se puede usar, no se tiene accesi
    }
}
