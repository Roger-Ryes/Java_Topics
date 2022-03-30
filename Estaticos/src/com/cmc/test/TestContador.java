package com.cmc.test;

import com.cmc.estaticos.Contador;

public class TestContador {
	public static void main(String[] args) {
		Contador c1 = new Contador();
		c1.incrementar();
		c1.incrementar();
		c1.imprimir(); 
		
		Contador c2 = new Contador();
		c2.imprimir();
		
		Contador c3 = new Contador();
		c3.incrementar();
		c3.imprimir();
		
	}
}
