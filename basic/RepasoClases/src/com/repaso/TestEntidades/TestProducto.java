package com.repaso.TestEntidades;

import com.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto pr = new Producto("Lapto", 500);
		pr.imprimir();
				
		pr.setPrecio(600.99);
		pr.imprimir();
		
		System.out.println(pr.calcularPrecioPromo(50)); 
		pr.imprimir();
		
		pr.setPrecio(-300.99);
		pr.imprimir();
		
	}
}
