package com.is3.SUCWS.model;

import java.sql.Date;
import java.sql.Time;

import com.is3.SUCWS.entity.Evento;

public class EventoModel {

	
	
	
	
	
	public EventoModel(int idevento, String titulo, String mensaje, Time hora, Date fecha, Date fechainicio,
			Date fechafin, boolean estado) {
		super();
		this.idevento = idevento;
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.hora = hora;
		this.fecha = fecha;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.estado = estado;
	}


	public EventoModel(Evento evento) {
	this.titulo = evento.getTitulo();
	this.idevento = evento.getIdevento();
	this.mensaje = evento.getMensaje();
	this.hora = evento.getHora();
	this.fecha = evento.getFecha();
	this.fechainicio = evento.getFechainicio();
	this.fechafin = evento.getFechafin();
	this.estado = evento.isEstado();
	}
	
	private int idevento;
	private String titulo;
	private String mensaje;
	private Time hora;
	private Date fecha;
	private Date fechainicio;
	private Date fechafin;
	private boolean estado;
	public int getIdevento() {
		return idevento;
	}


	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
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


	public Date getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}


	public Date getFechafin() {
		return fechafin;
	}


	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
