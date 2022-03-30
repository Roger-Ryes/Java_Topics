package com.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	//Constructor
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}else {
			this.precio = precio*(-1);
		}		
	}
	
	public double calcularPrecioPromo(int porcentajeI) {
		double porcentajeD = (Double.valueOf(porcentajeI)/100.00);
		double resp = this.precio - (this.precio*porcentajeD);
		this.precio = resp;
		return resp;
	}
	
	public void imprimir() {
		System.out.println("nombre: "+this.nombre);
		System.out.println("precio: "+this.precio);
		System.out.println("");
	}
}
