package com.cmc.sobreescritura;

public class Persona {
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // toString metodo de Object
    // Se sobreescribe el metodo de toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                '}';
    }

}
