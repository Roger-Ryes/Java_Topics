package com.cmc.jugar2;

import com.cmc.utils.Dado;

public class Test2 {
	public static void main(String[] args) {
		//Methodo2 
		/*	En la carpeta "lib" (Standar) se guardan los jar's
		 * 	Para utilizar el jar se va a:
		 * (properties > Java Built Path > Libraries > Add JARs > 
		 * ARCHIVO DEL PROJECTO > lib > **.jar)
		 * */
		int res = Dado.lanzar();
		System.out.println(res);
		
		//UN jar es un comprimido
		/* Un jar contiene los .class (el compilado)
		 * 
		 * 
		 * */
	}
}
