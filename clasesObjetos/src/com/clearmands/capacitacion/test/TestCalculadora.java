package com.clearmands.capacitacion.test;


import java.util.Date;

//import Siempre despues del paquete
import com.clearmands.capacitacion.entidades.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// Suma
		Calculadora cal;
		cal = new Calculadora();
		int resSuma = cal.suma(21, 3);
		double resResta = cal.resta(21, 3);
		double resMultiplicacion = cal.multiplicar(21, 3);

		System.out.println("Sumatoria");
		System.out.println(resSuma);
		System.out.println("Resta");
		System.out.println(resResta);
		System.out.println("Multiplicacion");
		System.out.println(resMultiplicacion);
		
		Date d;
	}

}
