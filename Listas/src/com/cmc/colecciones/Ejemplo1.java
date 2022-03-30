package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo1 {
	public static void main(String[] args) {
		Persona p = new Persona();
		//ArrayList de(String) llamado lista y lo instancio 
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("uno"); //0
		lista.add("dos"); //1
		lista.add("tres");//2
		int index = 1;
		String res = lista.get(index);
		System.out.println(res);
		
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		enteros.add(23);
		enteros.add(1);
		enteros.add(10);
		Integer resEnteros = enteros.get(0);
		System.out.println(resEnteros);
		
		
		//Array de persona
		ArrayList<Persona> persona = new ArrayList<Persona>();
		persona.add(new Persona());
		
		Persona recuperada = persona.get(0);
		
	}
}
