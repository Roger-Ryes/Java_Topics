package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {
		//Telefonos
		Telefono ta = new Telefono("movi","0987921935",10);
		Telefono tb = new Telefono("claro","0999854540",30);
		Telefono tc = new Telefono("claro","0999873725",20);
		Telefono td = new Telefono("movi","0999873725",20);
		
		//Admin Telefono
		AdminTelefono at = new AdminTelefono();
		
		//Contar Movi
		int resM = at.contarMovi(ta, tb, tc);
		System.out.println("Conteo Movi: "+ resM);
		System.out.println("");
		
		//Contar Claro
		int resC = at.contarClaro(ta, tb, tc, td);
		System.out.println("Conteo Claro: "+ resC);
		System.out.println("");		
	}

}
