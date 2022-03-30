package com.cmc.test;

import com.cmc.estaticos.Constante;

public class TestConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constante c = new Constante();
		int valor = c.NUM_REGISTROS;
		System.out.println(valor);
		
		int valor2 = Constante.NUM_LLAMADAS;
		System.out.println(valor2);
		
		//Ejemplo de constantes
		double pi = Math.PI;
		System.out.println(pi);
	}

}
