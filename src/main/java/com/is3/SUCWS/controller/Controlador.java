package com.is3.SUCWS.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.is3.SUCWS.entity.Evento;
import com.is3.SUCWS.model.EventoModel;
import com.is3.SUCWS.model.LugarModel;
import com.is3.SUCWS.service.EventoService;
import com.is3.SUCWS.service.LugarService;

@RestController
@RequestMapping("/suc")
@CrossOrigin
public class Controlador {

	@Autowired
	@Qualifier("servlugar")
	LugarService servlugar;
	
	
	@GetMapping("/lugar")
	public List<LugarModel> listar(){
		
		return servlugar.listar();
	}
	
	@GetMapping("/lugar/{nombre}")
	public LugarModel buscarLugarNombre(@PathVariable("nombre") String nombre){
		
		return servlugar.buscarLugarNombre(nombre);
	}
	
	@Autowired
	@Qualifier("servevento")
	EventoService servevento;

	@GetMapping("/evento")
	public List<EventoModel> listart(){
	
		return servevento.listar();
	}

	@DeleteMapping("/evento/{idevento}")
	public boolean eliminarUsuario(@PathVariable("idevento") int idevento) {
	
		return servevento.eliminar(idevento);
	}

	@PutMapping("/evento")
	public boolean agregarEvento(@RequestBody @Valid Evento evento) {
	
		return servevento.crear(evento);
	}
}