package com.cmc.predicado;

import java.util.function.Predicate;

public class A_AdminProduct {
    public void ejecute(Predicate<String> predicate){
        if(predicate.test("Hola mundo")){
            System.out.println("Si es mayor");
        }
    }
}
