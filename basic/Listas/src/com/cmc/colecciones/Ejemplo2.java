package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo2 {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Juan","Perez"));
		personas.add(new Persona("Maria","Vargas"));
		personas.add(new Persona());
		
		System.out.println("Numero de elementos de array: "+personas.size());
		
		Persona tmp = null;
		for(int i=0; i<personas.size(); i++) {
			tmp = personas.get(i);
			System.out.println(tmp.getNombre()+" - "+tmp.getApellido());
		}
		
	}
}
