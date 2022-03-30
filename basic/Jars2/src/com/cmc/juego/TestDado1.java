package com.cmc.juego;

import com.cmc.utils.Dado; // Se importo luego de referenciarlo

public class TestDado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//METHODO 1
	/*
	 * Desde otro projecto de java (Jars) llamar a 
	 * este proyecto(Jars2)
	 */
		
	/*Para importar la clase Dado del proyecto Jars
	 *se debe referenciarlos: 
	 *(properties > Java Built Path > Projects > Add > y referenciar el proyecto) 
	 * */
		int res = Dado.lanzar();
		System.out.println(res);
		
	//METHODO 2
	/* Si no quiere dar el codigo fuente, entonces se puede exportar
	 * en archivo jar:
	 * (export > Java > JAR file >next> EscogerArchivo & Donde guardar) 
	 * 
	 */
	}

}
