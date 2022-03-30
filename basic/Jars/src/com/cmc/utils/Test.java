package com.cmc.utils;

public class Test {
	public static void main(String[] args) {
		
		for(int i=0; i<20; i++){
			int res = Dado.lanzar();
			System.out.println("Valor: "+res);
		}

	}
}
