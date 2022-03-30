package com.cmc.test;

import com.cmc.herencia.Estudiante;
import com.cmc.herencia.Persona;

public class TestEstudiante {
	public static void main(String[] args) {
		Estudiante e = new Estudiante("Juan","Gomez");
		System.out.println("Estudiante: "+e);
		//System.out.println("Estudiante: "+e.toString());
		
		Persona p = new Persona("Pedro","Silvestre");
		System.out.println(p);
	}
}
