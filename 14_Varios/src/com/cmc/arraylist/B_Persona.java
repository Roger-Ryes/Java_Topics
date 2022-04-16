package com.cmc.arraylist;

public class B_Persona implements B_Reemplazable{
    private String nombre;

    public B_Persona(String nombre) {
        super();
        this.nombre = nombre;
    }
    public B_Persona(){

    }

    @Override
    public String toString() {
        return "B_Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
