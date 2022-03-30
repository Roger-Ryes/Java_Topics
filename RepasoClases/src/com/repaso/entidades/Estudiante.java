package com.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
	public void calificar(double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		if(this.nota >= 8) {
			this.resultado = "A";
		}
		else {
			this.resultado = "F";
		}
		return this.resultado;
	}
	
}
