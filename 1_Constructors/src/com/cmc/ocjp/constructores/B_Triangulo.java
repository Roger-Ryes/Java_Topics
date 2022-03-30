package com.cmc.ocjp.constructores;
//CONSTRUCTOR PADRE ( super() )
public class B_Triangulo extends B_Figura{
	public B_Triangulo(){
		super(2); // INVOCO AL CONSTRUCTO DE LA CLASE PADRE (RECIVE UN ENTERO)
		System.out.println("Ejecuta constructor Triangulo");
	}
}
