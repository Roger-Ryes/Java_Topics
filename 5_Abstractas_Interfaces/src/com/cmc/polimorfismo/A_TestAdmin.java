package com.cmc.polimorfismo;

import com.cmc.herencia.A_Animal;
import com.cmc.herencia.A_Perro;
import com.cmc.herencia.C_Gato;

public class A_TestAdmin {
    public static void main(String[] args) {
        A_AdminAnimal admin = new A_AdminAnimal();
        A_Animal a = new A_Perro();
        admin.adormecer(a); // va a depender a cual se esta apuntando

        a = new C_Gato();
        admin.adormecer(a); // va a depender a cual se esta apuntando
        
        a = new A_Animal();
        admin.adormecer(a); // va a depender a cual se esta apuntando
    }
}
