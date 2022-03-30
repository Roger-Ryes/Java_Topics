package clasesObjetos;

import java.security.DrbgParameters.NextBytes;

public class TestPersona {

	public static void main(String[] args) {
		System.out.println("Hello word");
		Persona p;
		//Instacia de objeto
		p = new Persona();
		
		//Valores iniciales 
		System.out.println("nombre: "+ p.nombre);
		System.out.println("edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);
		
		//Asignacion de valores
		p.nombre = "Pepe";
		p.edad = 23;
		p.estatura = 1.70;
		System.out.println("Objeto 1 con valores");
		System.out.println("nombre: "+ p.nombre);
		System.out.println("edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);
		
		Persona p2;
		//Instacia de objeto
		p2 = new Persona();
		//Asignacion de valores
		p.nombre = "Juan";
		p.edad = 26;
		p.estatura = 2.00;
		System.out.println("Objeto 2 con valores");
		System.out.println("nombre: "+ p.nombre);
		System.out.println("edad: "+p.edad);
		System.out.println("estatura: "+p.estatura);		
	}

}
