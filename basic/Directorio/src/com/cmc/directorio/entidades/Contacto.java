package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre;
	private String apellido;
	private boolean activo = false;
	private Telefono telefono;
	private double peso;
	
	//Constructor
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	
	
	//Mostrar Informacion
	public void mostrarContacto() {
		System.out.println("nombre: "+this.nombre);
		System.out.println("apellido: "+this.apellido);
		System.out.println("activo: "+this.activo);
		System.out.println("peso: "+this.peso);
		System.out.println("--Telefono Datos--");
		System.out.println("operadora: "+this.telefono.getOperadora());
		System.out.println("telefono: "+this.telefono.getNumero());
		System.out.println("");
	}

	
	//GET & SET
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}


	public Telefono getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
	
}
