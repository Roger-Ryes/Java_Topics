package com.repaso.entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private double estatura;
	private int codigo;
	
	//Constructors
	public Persona() {}
	public Persona(String nombre, String apellido, int codigo) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;
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
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//Other methods
	public String getNombreCompleto() {
		return this.nombre+" "+this.apellido;
	}
	public void agregarEstatura(double incremento) {
		this.estatura += incremento;
		System.out.println("Estatura Aumentada: "+this.estatura);
	}
	public void imprimir() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellido: "+this.getApellido());
		System.out.println("Estatura: "+this.getEstatura());
		System.out.println("Codigo: "+this.getCodigo());		
	}
	public double modificarEstatura(double incremento) {
		this.estatura += incremento;
		return this.estatura;
	}
	public String obtenerInformacion() {
		return this.getNombre()+" - "+this.getApellido()+" - "+this.getEstatura()+" - "+this.getCodigo();
	}	
	public double cambiarValores(int codigo, double estatura) {
		this.setCodigo(codigo);
		this.setEstatura(this.estatura + estatura);
		return this.getEstatura();		
	}
	
}
