package com.cmc.test;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio1 {
	public static void main(String[] args) {
		ArrayList<String> listas;
		/*Mapa guarda del tipo Clave valor
		<Tipo de la clave, tipo del dato>*/
		HashMap<String,String> mapa;
		
		mapa = new HashMap<String,String>();
		listas = new ArrayList<String>();
		
		listas.add("abc");
		mapa.put("1020","abc");	
		String a = listas.get(0);
		String m = mapa.get("1020");
		
		System.out.println("Valor del mapa");
		System.out.println(m);
	}
}
