package com.libreria.libros.dao.libos;

import org.springframework.stereotype.Service;

import com.libreria.libros.Libro;

@Service
public interface LibrosServicios {

	public Libro buscarPorId(String id);
	
	public Libro buscarPorCodigo(String codigo);
	
	public String addLibro(Libro libro);
}
