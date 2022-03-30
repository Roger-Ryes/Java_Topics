package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		this.celda1 = new Celda(c1);
		this.celda2 = new Celda(c2);
		this.celda3 = new Celda(c3);
		this.celda4 = new Celda(c4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("CodigoA: "+this.celda1.getCodigo());
		System.out.println("CodigoB: "+this.celda2.getCodigo());
		System.out.println("CodigoC: "+this.celda3.getCodigo());
		System.out.println("CodigoD: "+this.celda4.getCodigo());
		System.out.println("Saldo: "+this.saldo);
		System.out.println("");
	}
	
	public Celda buscarCelda(String c) {
		if(this.celda1.getCodigo() == c) {return this.celda1;}
		if(this.celda2.getCodigo() == c) {return this.celda2;}
		if(this.celda3.getCodigo() == c) {return this.celda3;}
		if(this.celda4.getCodigo() == c) {return this.celda4;}
		return null;
	}
	
	public void cargarProducto(Producto p, String codigo, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		if(celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(p, stock);			
		}
	}
	
	public void mostrarProductos() {
		this.celda1.mostrarCelda();
		this.celda2.mostrarCelda();
		this.celda3.mostrarCelda();
		this.celda4.mostrarCelda();
	}
	
	public Producto buscarProductoEnCelda(String codigo){
		Celda celdaResultante = this.buscarCelda(codigo);
		if(celdaResultante != null) {
			return celdaResultante.getProducto();
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		Celda celdaResultante = this.buscarCelda(codigo);
		if(celdaResultante != null) {
			return celdaResultante.getProducto().getPrecio();
		}
		return 0.0;
	}
	//Codigo de producto
	public Celda buscarCeldaProducto(String codigo) {
		if(this.celda1.getProducto().getCodigo() == codigo) {
			return this.celda1;
		}
		if(this.celda2.getProducto().getCodigo() == codigo) {
			return this.celda2;
		}
		if(this.celda3.getProducto().getCodigo() == codigo) {
			return this.celda3;
		}
		if(this.celda4.getProducto().getCodigo() == codigo) {
			return this.celda4;
		}
		return null;
	}
	
	public void incrementarProductos(String codigoPro, int items) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigoPro);
		if(celdaEncontrada!=null) {
			celdaEncontrada.setStock(items);
		}
	}
	
	public void vender(String codigoCel) {
		Celda celdaResultante = this.buscarCelda(codigoCel);
		if(celdaResultante!=null) {
			celdaResultante.setStock(celdaResultante.getStock() - 1); 
			//Mostrar valor de precio
			double precioMaquina = celdaResultante.getProducto().getPrecio();
			System.out.println("Precio: "+precioMaquina);
			this.saldo += precioMaquina;
			this.mostrarProductos();
		}		
	}
	
	public double venderConCambio(String codigoCel, double valorCliente) {
		Celda celdaResultante = this.buscarCelda(codigoCel);
		if(celdaResultante != null) {
			double precioMaquina = celdaResultante.getProducto().getPrecio();
			if(valorCliente  > precioMaquina) {
				double cambio = valorCliente - precioMaquina;
				return cambio;
			}
			celdaResultante.setStock(celdaResultante.getStock() - 1);
			//Mostrar valor de precio
			System.out.println("Precio: "+precioMaquina);
			this.saldo += precioMaquina;
			this.mostrarProductos();			
		}
		return 0.0;
	}
}
