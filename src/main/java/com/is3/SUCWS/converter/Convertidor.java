package com.is3.SUCWS.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.is3.SUCWS.entity.Evento;
import com.is3.SUCWS.entity.Lugar;
import com.is3.SUCWS.model.EventoModel;
import com.is3.SUCWS.model.LugarModel;

@Component("convertidor")
public class Convertidor {
	
	public List<EventoModel> convlistEvento(List<Evento> eventos){
		
		List<EventoModel> listEventoModel = new ArrayList<>();
		
		for(Evento evento : eventos) {
			
			listEventoModel.add(new EventoModel(evento));
		}
		
		return listEventoModel;
	}


	public List<LugarModel> convlistLugar(List<Lugar> lugares){
		
		List<LugarModel> listLugarModel = new ArrayList<>();
		
		for(Lugar lugar : lugares) {
			
			listLugarModel.add(new LugarModel(lugar));
		}
		
		return listLugarModel;
	}
	
	
}
