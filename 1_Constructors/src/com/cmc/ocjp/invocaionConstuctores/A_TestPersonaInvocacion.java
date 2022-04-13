package com.cmc.ocjp.invocaionConstuctores;

import com.cmc.ocjp.constructores.A_Persona;

public class A_TestPersonaInvocacion {
	public static void main(String[] args) {
		A_Persona p1 = new A_Persona("Pepe",32);
		A_Persona p2 = new A_Persona("Pancho");
//		A_Persona p3 = new A_Persona();/* NO permite crear el constructor por defecto ya que se ha creado otros constructores en la clase */
		System.out.println("p1: "+p1.showData());
		System.out.println("p2: "+p2.showData());
	}
}
