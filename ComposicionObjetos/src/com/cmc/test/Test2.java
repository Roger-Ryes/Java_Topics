package com.cmc.test;

import com.cmc.composicion.Cliente;
import com.cmc.composicion.Direccion;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c = new Cliente("Santiago", 35);
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Edad: "+c.getEdad());
		System.out.println("Domicilio: "+c.getDir());
		System.out.println("");
		
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Av. Siempre viva");
		dir.setCalleSecundaria("Amazonas");
		
		c.setDir(dir);
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Edad: "+c.getEdad());
		
		//Metodo 1
		Direccion d1 = c.getDir();		
		//System.out.println("Domicilio: "+d1.getCallePrincipal());
		//System.out.println("Domicilio: "+d1.getCalleSecundaria());
		
		//Metodo 2
		System.out.println("Domicilio: "+c.getDir().getCallePrincipal());//El resultado es null
		System.out.println("Domicilio: "+c.getDir().getCalleSecundaria());//El resultado es null
		
		
	}

}
