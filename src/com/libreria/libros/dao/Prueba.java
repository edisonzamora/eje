package com.libreria.libros.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.libreria.libros.utils.Mensaje;

@Component("prueba")
public class Prueba {
	private Logger logger = LogManager.getLogger(this);
	public Prueba() {
		logger.info(Mensaje.setMensaje("Prueba in"));	
	}

	public void confirar(){
		logger.info(Mensaje.setMensaje("confirar in"));	
	}
	
	
}
