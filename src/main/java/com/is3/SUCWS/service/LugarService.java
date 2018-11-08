package com.is3.SUCWS.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.is3.SUCWS.converter.Convertidor;
import com.is3.SUCWS.model.LugarModel;
import com.is3.SUCWS.repository.ILugarRepository;

@Service("servlugar")
public class LugarService {

	@Autowired
	@Qualifier("repolugar")
	private ILugarRepository repolugar;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	private static final Log logger = LogFactory.getLog(LugarService.class);

	public List<LugarModel> listar() {
		
		logger.info("Listando Lugares");
		
		try {

			return convertidor.convlistLugar(repolugar.findAll());
		} catch (Exception e) {
			
			logger.error("Error al listar Lugares");
			return null;
		}
	}
	
	public LugarModel buscarLugarNombre(String nombre) {
		
		logger.info("Buscando Lugar por nombre");
		
		try {

			return new LugarModel(repolugar.findByNombre(nombre));
		} catch (Exception e) {
			
			logger.error("Error al buscar Lugar por nombre");
			return null;
		}
	}
}
