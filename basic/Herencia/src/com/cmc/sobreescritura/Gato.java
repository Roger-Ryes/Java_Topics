package com.cmc.sobreescritura;

import com.cmc.herencia.Animal;

public class Gato extends Animal{
	//Sobre escritura
	/*	Partimos del concepto de herencia
	 *	Al tener algunos metodos heredados del padre que no servira la implementacion
	 *	se puede sobreescribir
	 */
	public void dormir() {//Sobreescribo metodo del padre
		System.out.println("Gato durmiendo");
	}
	
	public void maullar() {
		System.out.println("El gato maulla");
	}
}
