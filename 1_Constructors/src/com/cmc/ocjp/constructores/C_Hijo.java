package com.cmc.ocjp.constructores;

public class C_Hijo extends C_Padre{
	public C_Hijo() {
//		this();
		super(); //ESTA LLAMADA ESTA IMPLICITA
		System.out.println("Ejecuto constructor hijo");
	}
}
