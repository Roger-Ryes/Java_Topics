package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContact1 {

	public static void main(String[] args) {
		//CLiente 1
		Telefono tel1 = new Telefono("claro","0987921935",10);
		tel1.setTieneWhatsapp(true);
		Contacto c1 = new Contacto("roger","reyes",tel1,1.70);
		c1.mostrarContacto();
		
		//CLiente 1
		Telefono tel2 = new Telefono("claro","0999873725",20);
		Contacto c2 = new Contacto("david","paredes",tel2,1.80);
		c2.mostrarContacto();
		
		//Admin Contacto
		System.out.println("-----------------------");
		System.out.println("----ADMIN CONTACTO----");
		AdminContactos ac = new AdminContactos();
		
			//Mas pesado
		Contacto pesado = ac.buscarMasPesado(c1, c2);
		pesado.mostrarContacto();
			//Operadora
		boolean operadoras = ac.compararOperadoras(c1, c2);
		System.out.println("Operadoras iguales: "+operadoras);
			//Tiene Wasa
		ac.activarUsuario(c1);
		c1.mostrarContacto();
		
		
		
	}
}
