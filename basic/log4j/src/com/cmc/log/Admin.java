package com.cmc.log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Admin { 

	private static Logger logger = LogManager.getLogger(Admin.class);
	
	public void agregar() {
		//Se imprimira cada valor dependiendo de su nivel 1°warn, 2°info, 3°debug, 4°trace
		//1° el menor y 4° el mayor
		logger.warn("Mensaje de warn");		//Advertencia
		logger.info("Mensaje de info");		//Informacion
		logger.debug("Mensaje debug");		//Muestra el valor de variable, archivos, condiciones
		logger.trace("Mensaje de trace");	//Mensajes granular mas especificas
		
		//Loggear errores
		//SIn importar el nivel siempre se va a imprimir
		logger.error("Mensaje de erro");
	}
}
