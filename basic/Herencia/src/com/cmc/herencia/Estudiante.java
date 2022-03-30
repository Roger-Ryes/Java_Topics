package com.cmc.herencia;

public class Estudiante {
	private String nombre;
	private String apellido;
	//COnstructor
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//SET & GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//SObreescribir
	/*
	public String toString() {
		return "Nombre: "+this.nombre+" - Apellido: "+this.apellido;
	}*/
}
