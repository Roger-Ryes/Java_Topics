package com.repaso.TestEntidades;

import java.util.Scanner;

import com.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est = new Estudiante("Pepe");
		System.out.println("Ingresar nota:");
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    String nota = myObj.nextLine();  // Read user input
	    		
		est.calificar(Double.valueOf(nota));
		System.out.println(est.getResultado());
	}

}
