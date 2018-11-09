package com.is3.SUCWS.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.is3.SUCWS.converter.Convertidor;
import com.is3.SUCWS.entity.Evento;
import com.is3.SUCWS.model.EventoModel;
import com.is3.SUCWS.repository.EventoRepository;


@Service("servevento")
public class EventoService {
	@Autowired
	@Qualifier("repoevento")
	private EventoRepository repoevento;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor Convertidor;
	
	private static final Log logger = LogFactory.getLog(EventoService.class);
	
	public boolean crear(Evento evento) {
		logger.info("Creando Evento");
		try {
			
			repoevento.save(evento);
			logger.info("Evento creado");
			return true;
		} catch (Exception e) {
			logger.error("Error al crear Evento");
			return false;
		}
	}
	
	
	
	public boolean eliminar(int idevento) {
		logger.info("Eliminando Evento por ID");
		try {
			
			Evento evento = repoevento.findByIdevento(idevento);
			repoevento.delete(evento);
			logger.info("Evento eliminado");
			return true;
		} catch (Exception e) {
			logger.error("Error al eliminar Evento");
			return false;
		}
	}
	
	
	public List<EventoModel> listar() {
		logger.info("Listando Eventos");
		try {

			return Convertidor.convlistEvento(repoevento.findAll());
		} catch (Exception e) {
			logger.error("Error al listar Eventos");
			return null;
		}
	}
	
	
	}
