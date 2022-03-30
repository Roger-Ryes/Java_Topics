package com.cmc.test;

import com.cmc.composicion.Cliente;
import com.cmc.composicion.Direccion;

public class Test3 {
	public static void main(String[] args) {
		Cliente c = new Cliente("Santiago",35);
		System.out.println("nombre: "+ c.getNombre());
		System.out.println("edad: "+c.getEdad());
		
		Direccion d = c.getDir();
		System.out.println("Calle principal: "+d.getCallePrincipal());
		System.out.println("Calle secundaria: "+d.getCalleSecundaria());
	}
	
}
