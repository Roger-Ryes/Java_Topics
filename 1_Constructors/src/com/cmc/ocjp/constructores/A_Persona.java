package com.cmc.ocjp.constructores;

//CONSTRUCTORES
public class A_Persona {
    private String nombre;
    private int edad;

    A_Persona() {
        nombre = "";
    }

    public A_Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // THIS()
    public A_Persona(String nombre) {
        this("Prueba", 8); //INVOCO AL OTRO CONSTRUCTOR DE LA MISMA CLASE
        this.nombre = nombre;
    }

    public String showData(){
        return this.nombre+" "+this.edad;
    }
}
