package com.cmc.estaticos;

public class Constante {
		//LAS CONSTANTES DEBE IR EN MAYUSCULAS
	
		//Para definir una constante se usa: "final"
	private final int NUM_PAGINAS=0;
	public final int NUM_REGISTROS=5;
		//Una constante debe ser estatico
	public static final int NUM_LLAMADAS=2;
	
	public void test() {
		//numPaginas=1; //No se puede, porque es una constante
		System.out.println(NUM_PAGINAS);
		System.out.println(NUM_REGISTROS);
		System.out.println(NUM_LLAMADAS);
	}
}
