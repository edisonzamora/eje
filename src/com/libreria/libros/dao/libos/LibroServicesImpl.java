package com.libreria.libros.dao.libos;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.libreria.libros.Libro;
import com.libreria.libros.utils.Mensaje;

@Service("libroServicesImpl")
public class LibroServicesImpl implements LibrosServicios {

	@Autowired
	@Qualifier("libroDao")
	LibroDao libroDao;

	public LibroServicesImpl() {

	}

	private Logger logger = LogManager.getLogger(this);

	@Override
	public Libro buscarPorId(String id) {
		logger.info(Mensaje.setMensaje("servicio buscarPorId"));
		Libro libro = libroDao.getFineById(id);
		return libro;
	}

	@Override
	public String addLibro(Libro libro) {
		logger.info(Mensaje.setMensaje("servicio addLibro"));
		String mensaje = "REVISE LOS DATOS , FALTA ALGUNO ";

		if (!libro.getAutor().equalsIgnoreCase("")
				|| libro.getAutor() != null && !libro.getNombre().equalsIgnoreCase("") || libro.getNombre() != null) {
			logger.info("con autor y nombre");
			// asigamnos al libro un codigo aleatorio
			libro.setCodigo(generateCode());
			// buscamos x codigo
			String codigo=libro.getCodigo();
			if (false==existeCodigo(codigo)) {
				logger.info("vamos a registrarlo");

				if (libroDao.addLibro(libro)) {
					mensaje = "REGISTRADO CORRECTAMENTE";
					return mensaje;
				}
			}
		}

		return mensaje;
	}

	private String generateCode() {
		String code = UUID.randomUUID().toString();
		return code;
	}

	@Override
	public Libro buscarPorCodigo(String codigo) {
		Libro libroencontrado = libroDao.getFineByCodigo(codigo);
		return libroencontrado;
	}

	private boolean existeCodigo(String codigo) {
		logger.info("existeCodigo ?");
		if (null != buscarPorCodigo(codigo)){
			logger.info("existe");
			return true;
		}
		logger.info("No existe");
		return false;
	}

}
