package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto ca, Contacto cb) {
		if(ca.getPeso() > cb.getPeso()) {
			return ca;
		}
		else {
			return cb;
		}
	}
	
	public boolean compararOperadoras(Contacto ca, Contacto cb) {
		if(ca.getTelefono().getOperadora() == cb.getTelefono().getOperadora()) {
			return true;
		}
		return false;
	}
	
	public void activarUsuario(Contacto ca) {
		if(ca.getTelefono().isTieneWhatsapp()) {
			ca.setActivo(true);
		}
	}
}
