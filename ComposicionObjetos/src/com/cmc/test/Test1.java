package com.cmc.test;

import com.cmc.composicion.Cliente;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancio la direccion
		Cliente c = new Cliente("Santiago", 35);
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Edad: "+c.getEdad());
		System.out.println("Domicilio: "+c.getDir());
	}

}
