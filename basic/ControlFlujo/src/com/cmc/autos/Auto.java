package com.cmc.autos;

public class Auto {
	private int anio;
	private String marca;
	private int tamanioTanque;
	private int cantidadGasolina;
		
	public Auto(String marca, int tamanioTanque){
		this.marca = marca;
		this.tamanioTanque = tamanioTanque;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void mostrarInfo() {
		System.out.println("------------------");
		System.out.println("cantidad gasolina: "+cantidadGasolina);
		System.out.println("year: "+ anio);
		System.out.println("marca: "+ marca);
		System.out.println("tamanio tanque: "+ tamanioTanque);
		System.out.println("//////////////////");
	}
	
	public void cargarGasolina(int cantidad) {
		if(tamanioTanque == cantidadGasolina) {
			System.out.println("Tanque lleno");
		} 
		else if((tamanioTanque-cantidadGasolina)>=cantidad) {
			cantidadGasolina += cantidad;
		}
		else {
			System.out.println("Tanque casi lleno, llenar solo:"+(tamanioTanque-cantidadGasolina));
		}
	}
	
	
}
