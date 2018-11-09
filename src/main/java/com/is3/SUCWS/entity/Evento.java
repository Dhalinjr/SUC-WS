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
	

	public Evento(int idevento, String mensaje, Time hora, Date fecha, boolean estado) {
		super();
		this.idevento = idevento;
		this.mensaje = mensaje;
		this.hora = hora;
		this.fecha = fecha;
		this.estado = estado;
	}

	public Evento() {}

	
	@Id
	@GeneratedValue
	@Column(name="idevento", nullable=false)
	private int idevento;
	
	@Column(name="mensaje", nullable=false, unique=true)
	private String mensaje;

	@Column(name="hora", nullable=false)
	private Time hora;
	
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@Column(name="estado", nullable=false)
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

	public void setMnesaje(String mensaje) {
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
