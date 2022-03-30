package com.cmc.test;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersona adp = new AdminPersona();
		adp.agregar(new Persona("Roger","Reyes"));
		adp.agregar(new Persona("Marco","Polo"));
		adp.mostrarInfo();
	}

}
