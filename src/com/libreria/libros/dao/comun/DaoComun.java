package com.libreria.libros.dao.comun;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.libreria.libros.utils.Mensaje;

@Repository
public class DaoComun extends CrudDaoImp {
	@Autowired
	private NamedParameterJdbcTemplate npjt;

	private Logger logger = LogManager.getLogger(this);

	@Override
	protected NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		logger.info(Mensaje.setMensaje("getNamedParameterJdbcTemplate"));
		return npjt;
	}

}
