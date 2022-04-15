package com.cmc.tostring;

import java.util.Objects;

public class A_Persona {
    private String nombre;
    private String apellido;

    public A_Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // toString del metodo Object
    @Override
    public String toString() {
        return "A_Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    // equals

    @Override
    public boolean equals(Object obj) {
        A_Persona persona = (A_Persona) obj;
        return getNombre().equals(persona.nombre) && getApellido().equals(persona.apellido);
    }

}
