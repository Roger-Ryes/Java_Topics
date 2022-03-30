package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class Ejercicio2 {
	public static void main(String[] args) {
		HashMap<String,Cliente> clientes;
		clientes = new HashMap<String,Cliente>();
		clientes.put("172565",new Cliente("172565","Roger Reyes"));
		
		Cliente c = clientes.get("172565");
		System.out.println(c);
	}
}
