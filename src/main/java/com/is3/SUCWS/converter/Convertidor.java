package com.is3.SUCWS.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.is3.SUCWS.entity.Lugar;
import com.is3.SUCWS.model.LugarModel;

@Component("convertidor")
public class Convertidor {

	public List<LugarModel> convlistLugar(List<Lugar> lugares){
		
		List<LugarModel> listLugarModel = new ArrayList<>();
		
		for(Lugar lugar : lugares) {
			
			listLugarModel.add(new LugarModel(lugar));
		}
		
		return listLugarModel;
	}
	
	
}
