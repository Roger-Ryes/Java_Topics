package com.cmc.autos.test;

import com.cmc.autos.Auto;

public class TestAutos {

	public static void main(String[] args) {
		//marca, tamanio tanque
		Auto au = new Auto("chevrolet", 40);
		au.setAnio(2010);
		//
		au.mostrarInfo();
		
		au.cargarGasolina(20);
		au.mostrarInfo();
		
		au.cargarGasolina(10);
		au.mostrarInfo();

		au.cargarGasolina(40);
		au.mostrarInfo();
	}

}
