package com.is3.SUCWS.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Eventos")
public class Evento {
	

	

	

	public Evento(int idevento, String titulo, String mensaje, Time hora, Date fecha, Date fechainicio, Date fechafin,
			boolean estado) {
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

	public Evento() {}

	
	@Id
	@GeneratedValue
	@Column(name="idevento", nullable=false)
	private int idevento;
	
	@Column(name="titulo", nullable=false)
	private String titulo;
	
	@Column(name="mensaje", nullable=false)
	private String mensaje;

	@Column(name="hora", nullable=false)
	private Time hora;
	
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@Column(name="fechainicio", nullable=false)
	private Date fechainicio;
	
	@Column(name="fechafin", nullable=false)
	private Date fechafin;
	
	@Column(name="estado", nullable=false)
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
