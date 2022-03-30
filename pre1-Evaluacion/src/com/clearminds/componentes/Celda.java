package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	//constructo
	public Celda(String codigo) {
		//super();
		this.codigo = codigo;
	}
	
	//Metodo ingresar producto
	public void ingresarProducto(Producto p, int stock) {
		this.producto = p;
		this.stock = stock;
	}
	
	//Mostrar datos
	
	public void mostrarCelda() {
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Stock: "+this.stock);
		if(this.producto != null) {
			System.out.println("Nombre de producto: "+this.producto.getNombre());
			System.out.println("Nombre de precio: "+this.producto.getPrecio());
			System.out.println("Codigo de producto: "+this.producto.getCodigo());
		}
	}
	//Set & Get
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
