package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	//COntructor
	public Producto(String codigo, String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	//Mostrar Info
	public void mostrarInformacion() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Precio: "+this.precio);
		System.out.println("Codigo: "+this.codigo);
	}

	//Aumenta precio
	public void incrementarPrecio(int porcentaje) {
		double porcentajeD = porcentaje;
		double porcentajeDecimal= (porcentajeD/100);
		this.precio = this.precio + (this.precio*porcentajeDecimal);
	}
		
	//Disminuir precio
	public void disminuirPrecio(double porcentaje) {
		this.precio = this.precio - porcentaje;
	}

	//GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
