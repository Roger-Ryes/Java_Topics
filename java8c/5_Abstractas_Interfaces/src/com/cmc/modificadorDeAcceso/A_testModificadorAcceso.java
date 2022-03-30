package com.cmc.modificadorDeAcceso;

public class A_testModificadorAcceso {
    public void probarAccesos(){
        A_modificadorDeAcceso conten = new A_modificadorDeAcceso();
        conten.varDefault = 0;      // Si accede porque esta en el mismo paquete
        conten.varProtected = 0;    // Similar a Default
        conten.varPublic =0;        // Se puede acceder siempre
//        conten.varPrivate = 0;      // No se puede usar, no se tiene accesi
    }
}
