package com.cmc.test;

import com.cmc.estaticos.Utils;

public class TestEstaticos {
	public static void main(String[] args) {
		//Instanciar metodo
		//Me dirigo al metodo por la referencia (u)
		Utils u = new Utils();
		//EL metodo test() pertenece al objeto
		u.test();
		
		//El metodo statico test1() pertenece a la clase
		Utils.test1();
		
		//Otros metodos estaticos
			//Clase Math
		double res = Math.random();
		System.out.println(res);
			//Clase Integer
		int valor = Integer.parseInt("23");
		System.out.println(valor);
	}
}
