package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp = false;
	
	//Constructor
	public Telefono(String operadora, String numero, int codigo){
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
	}
	
	
	//Mostrar Informacion
	public void mostrarInfo() {
		System.out.println("Operadora: "+this.operadora);
		System.out.println("Numero: "+this.numero);
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Tiene Whatsapp: "+this.tieneWhatsapp);
		System.out.println("");
	}


	//SET & GET
	public String getOperadora() {
		return operadora;
	}


	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}


	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}	
}
