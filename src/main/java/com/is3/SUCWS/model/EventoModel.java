package com.is3.SUCWS.model;

import java.sql.Date;
import java.sql.Time;

import com.is3.SUCWS.entity.Evento;

public class EventoModel {

	
	public EventoModel(int idevento, String mensaje, Time hora, Date fecha, boolean estado) {
		super();
		this.idevento = idevento;
		this.mensaje = mensaje;
		this.hora = hora;
		this.fecha = fecha;
		this.estado = estado;
	}
	public EventoModel(Evento evento) {
	this.idevento = evento.getIdevento();
	this.mensaje = evento.getMensaje();
	this.hora = evento.getHora();
	this.fecha = evento.getFecha();
	this.estado = evento.isEstado();
	}
	
	private int idevento;
	private String mensaje;
	private Time hora;
	private Date fecha;
	private boolean estado;
	public int getIdevento() {
		return idevento;
	}
	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
