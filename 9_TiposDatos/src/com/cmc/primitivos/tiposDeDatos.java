package com.cmc.primitivos;

public class tiposDeDatos {
    public static void main(String[] args) {
        byte by = 0;     // 8 ocupa bites
        short sh = 0;    //16
        int in = 0;      //32
        long lo = 0;     //64

        float f = 0;    //32
        double d = 0;   //64

        char c='a';     //16

        boolean boo = true; // 1

    //    En un contenedor (byte) no se puede colocar algo mas grande (int)
//        by=in;
        in=by;

        // Un entero puedo guardar en un flotante
        f = lo;

        // A un char se le puedo mandar codigo ASCII
        c=123;
        System.out.println(c);

        // Un char puedo guardar en un entero
        in = c;
        System.out.println(in);

        //
        f=10;
//        f=10.10; // Es un Double, un double es mayor a un float
        d=10.10;
        // Existen algunos sufijos para indicar explicitamente el tipo de dato
        f=10.10f;
        d= 100.110D;
        lo=10L;
    }

}
