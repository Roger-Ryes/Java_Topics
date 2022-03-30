package com.cmc.test;

import com.cmc.composicion.AdminCliente;
import com.cmc.composicion.Cliente;

public class TestBuscarMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente a = new Cliente("Mario",32);
		Cliente b = new Cliente("Jose",32);
		
		AdminCliente ac = new AdminCliente();
		Cliente res = ac.buscarMayor(a, b);
		
		System.out.println("res: "+res);
		//Validacion
		if(res!=null) {
			//PrintResult
			System.out.println("Nombre: "+res.getNombre());
		}else {
			//PrintResult
			System.out.println("Los dos Usuarios tienen la misma edad");
		}
		
	}

}
