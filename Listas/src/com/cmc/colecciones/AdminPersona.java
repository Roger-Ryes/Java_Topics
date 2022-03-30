package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class AdminPersona {
	private ArrayList<Persona> personas;
	
	public AdminPersona() {
		this.personas = new ArrayList<Persona>();
	}
	
	public void agregar(Persona persona) {
		this.personas.add(persona);
	}
	
	public void mostrarInfo() {
		Persona tmp = null;
		for(int i=0; i< this.personas.size(); i++) {
			tmp = this.personas.get(i);
			System.out.println(tmp.getNombre()+" - "+tmp.getApellido());
		}
	}
	
	//Retorna la persona que le corresponde el nombre
	public Persona buscar(String nombre) {
		Persona tcp = null;
		for(int i=0; i<this.personas.size(); i++) {
			tcp = this.personas.get(i);
			//if(tcp.getNombre() == nombre) //Para enteros
			if(nombre.equals(tcp.getNombre())){ //Para strings
				return tcp;
			}
		}
		return null;
	}
}
