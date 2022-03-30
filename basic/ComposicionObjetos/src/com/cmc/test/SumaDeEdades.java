package com.cmc.test;

import com.cmc.composicion.AdminCliente;
import com.cmc.composicion.Cliente;

public class SumaDeEdades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TEST DE SUMA
		AdminCliente ac = new AdminCliente();
		Cliente c1 = new Cliente("Pablo",17);
		Cliente c2 = new Cliente("David",10);
		int res = ac.sumaEdad(c1, c2);
		System.out.println("Suma de Edades: "+res);
		System.out.println("");
		
		//TEST DE EDAD PARA TOMAR
		boolean puede = ac.puedeTomarCerveza(c1);
		System.out.println("Puede "+c1.getNombre()+" tomar: "+puede);
		System.out.println("");
		c1.mostrarInfo();
	}
	

}
