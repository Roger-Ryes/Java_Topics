package com.cmc.composicion;

public class AdminCliente {
	
	
	//Crear un metodo que recibe dos 2 clientes y retorna el tipo Cliente
	//Retorna el mayor de los 2 clientes que recibe, si ninguno es mayor retorna null
	public Cliente buscarMayor(Cliente c1, Cliente c2) {
		if(c1.getEdad() > c2.getEdad()) {
			return c1;
		}
		else if(c1.getEdad() < c2.getEdad()){
			return  c2;
		}
		else {
			return 	null;
		}
		
	}
	
	//Crear un metodo sumar que recive dos cliente y retorna la edad 
	//sumada de ambos
	public int sumaEdad(Cliente c1, Cliente c2) {
		int e1 = c1.getEdad();
		int e2 = c2.getEdad();
		return e1 + e2;
	}
	
	//Puede el metodo puedeTomarCerveza
	public boolean puedeTomarCerveza(Cliente a) {
		if(a.getEdad() >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
}
