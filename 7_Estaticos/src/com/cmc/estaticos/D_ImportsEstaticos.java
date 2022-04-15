package com.cmc.estaticos;

import static java.lang.Math.random;
import static java.lang.Math.abs;
import static java.lang.Math.PI;
import static java.lang.Integer.*;

// Al importar un statico no solo se llama a la clase, sino tambien al metodo

public class D_ImportsEstaticos {
    // Sin import
//    double valor = Math.random();
//    double valor2 = Math.abs(valor) + Math.PI;

//    int x = Integer.parseInt("10");


    // Con import
    double valor = random();
    double valor2 = abs(valor) + PI;

    int x = parseInt("10");
}
