package com.repaso.TestEntidades;

import com.repaso.entidades.Persona;
import com.repaso.entidades.Validacion;

public class TestEntidades {

	public static void main(String[] args) {
		Persona per = new Persona("Roger","Reyes",1234);
		
		per.imprimir();
		per.cambiarValores(567, 1.70);
		
		System.out.println("");
		System.out.println(per.obtenerInformacion());
		per.modificarEstatura(0.1);
		
		System.out.println("");
		per.imprimir();
	
		per.setCodigo(123);
		System.out.println("");
		per.imprimir();
		
		System.out.println(per.getNombreCompleto());
		System.out.println("");
		
		System.out.println(per.cambiarValores(9876, 2.1));
		
		System.out.println("");
		per.imprimir();
		
	}

	public static void TestValidacion() {
		Validacion val = new Validacion();
		val.validarMonto(0);
	}
}
