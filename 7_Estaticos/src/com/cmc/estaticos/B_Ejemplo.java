package com.cmc.estaticos;

public class B_Ejemplo {
    int valor;
    static int count;

    B_Ejemplo(){
        this.valor++;
        count++;
    }

    public static void main(String[] args) {
        count++;
        B_Ejemplo e1 = new B_Ejemplo();
        B_Ejemplo e2 = new B_Ejemplo();
        System.out.println("val: "+e1.valor);
        System.out.println("estatic: "+count);
    }
}
