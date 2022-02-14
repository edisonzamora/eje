/**
 * LibrosSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.libreria.libros;





import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.libreria.libros.dao.Prueba;
import com.libreria.libros.dao.libos.LibroServicesImpl;
import com.libreria.libros.dao.libos.LibrosServicios;
import com.libreria.libros.utils.Mensaje;

/**
 * LibrosSkeleton java skeleton for the axisService
 */
public class LibrosSkeleton {
	
	@Autowired
	@Qualifier("libroServicesImpl")
	private LibrosServicios servicioLib ;
	/**
	 * Auto generated method signature
	 *
	 * @param librosRequest
	 * @return librosResponse
	 */

	private Logger logger = LogManager.getLogger(this);

	@Autowired
	@Qualifier("prueba")
	Prueba prueba;
	public com.libreria.libros.LibrosResponse buscarLibro(com.libreria.libros.LibrosRequest librosRequest) {
		logger.info(Mensaje.setMensaje("buscarLibro service in"));
		prueba.confirar();
		LibrosResponse librosResponse = new LibrosResponse();
		String id = librosRequest.getId();
		Libro libro = servicioLib.buscarPorId(id);
		librosResponse.setLibro(libro);
		logger.info(Mensaje.setMensaje("buscarLibro service out"));
		return librosResponse;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addLibrosRequest
	 * @return addLibrosResponse
	 */
	public com.libreria.libros.AddLibrosResponse addLibro(com.libreria.libros.AddLibrosRequest addLibrosRequest) {
		// TODO : fill this with the necessary business logic
		logger.info(Mensaje.setMensaje("addLibro service in"));
		AddLibrosResponse respuesta=new AddLibrosResponse();
		Libro librorequest=addLibrosRequest.getLibro();
		String mensajeSalida=servicioLib.addLibro(librorequest);
		respuesta.setConfirmacion(mensajeSalida);
		logger.info(Mensaje.setMensaje("addLibro service out"));
		return respuesta;
	}

	private Libro libroMock() {
		// TODO Auto-generated method stub
		logger.info("Entrando al mock");
		Libro libro = new Libro();
		libro.setAutor("Edison");
		libro.setCodigo("12345");
		libro.setNombre("Borrador");
		return libro;
	}
}
