package com.is3.SUCWS.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.is3.SUCWS.model.LugarModel;
import com.is3.SUCWS.service.LugarService;

@RestController
@RequestMapping("/suc")
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
}
