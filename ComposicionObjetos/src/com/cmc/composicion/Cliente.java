package com.cmc.composicion;

public class Cliente {
	private String nombre;
	private int edad;
	private Direccion dir;
	
	//Constructor
	public Cliente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//GET & SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDir() {
		return dir;
	}
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Edad: "+this.getEdad());
		if(this.getDir() != null) {
			System.out.println("Direccion: "+this.getDir().getCallePrincipal()+" - "+this.getDir().getCalleSecundaria());
		}else {
			System.out.println("Direccion: Sin direccion");
		}
		
	}
	
	
}
