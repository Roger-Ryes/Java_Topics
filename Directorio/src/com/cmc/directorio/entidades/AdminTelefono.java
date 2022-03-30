package com.cmc.directorio.entidades;

public class AdminTelefono {
	//Metodos
	public void activarMensajeria(Telefono tel) {
		if(tel.getOperadora() == "movi") {
			tel.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono ta, Telefono tb, Telefono tc) {
		int cont = 0;
		if(ta.getOperadora() == "movi") {cont++;}
		if(tb.getOperadora() == "movi") {cont++;}
		if(tc.getOperadora() == "movi") {cont++;}
		return cont;
	}
	public int contarClaro(Telefono ta, Telefono tb, Telefono tc, Telefono td) {
		int cont = 0;
		if(ta.getOperadora() == "claro") {cont++;}
		if(tb.getOperadora() == "claro") {cont++;}
		if(tc.getOperadora() == "claro") {cont++;}
		if(td.getOperadora() == "claro") {cont++;}
		return cont;
	}
}
