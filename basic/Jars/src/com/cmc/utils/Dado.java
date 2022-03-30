package com.cmc.utils;

public class Dado {
	public static int lanzar() {
		double d = Math.random();
		int valor = (int)(d*6)+1;
		return valor;
	}
}
