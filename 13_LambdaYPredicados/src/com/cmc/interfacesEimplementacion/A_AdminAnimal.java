package com.cmc.interfacesEimplementacion;

public class A_AdminAnimal {
    public void alimentar(A_Animal animal){
        animal.comer();
    }

    public void delete(B_LambdaDescartar descartar){
        descartar.descartar((int)Math.ceil(Math.random()*10));
    }

    public void reemplazado( B_Sustituible sustituible ){
        if(sustituible.sustituible((int)Math.ceil(Math.random()*10))){
            System.out.println("Se ha reemplazado");
        }else{
            System.out.println("No reemplazado");
        }
    }
}
