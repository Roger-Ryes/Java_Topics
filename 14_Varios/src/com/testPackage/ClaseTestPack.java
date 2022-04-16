package com.testPackage;

// Al importar se debe llegar solo hasta la clase
//import package1.ClasePack1;
//import package1.ClasePack2;
// Importar todo de un packete
import package1.*;
import package1.com.ClasePackCom1;

public class ClaseTestPack {
    public static void main(String[] args) {
        ClasePack1 cp1 = new ClasePack1();
        ClasePack2 cp2 = new ClasePack2();
        ClasePackCom1 cpc = new ClasePackCom1();
    }
}
