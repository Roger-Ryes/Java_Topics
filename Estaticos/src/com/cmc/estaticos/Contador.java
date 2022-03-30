package com.cmc.estaticos;

public class Contador {
	private int contador; //pertenece al objeto
	private static int contadorEstatico; //pertenece a la clase
	
	public void incrementar() {
		contador++;
		contadorEstatico++;
	}
	
	public void imprimir() {
		System.out.println("contador: "+contador);
		System.out.println("contador statico: "+contadorEstatico);
	}
}
