package com.cmc.modificadorDeAcceso;

public class A_modificadorDeAcceso {
    public int varPublic;
    protected int varProtected;
    int varDefault;
    private int varPrivate;

    public void testPrivate(){
        this.varPrivate = 0;
    }
}
