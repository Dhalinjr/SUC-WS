package com.is3.SUCWS.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lugar")
public class Lugar {
	
	public Lugar(long idlugar, String nombre, String descripcion, double latitud, double longitud, Date fecha,
			boolean estado) {

		this.idlugar = idlugar;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.fecha = fecha;
		this.estado = estado;
	}

	public Lugar() {}

	@Id
	@GeneratedValue
	@Column(name="idlugar", nullable=false)
	private long idlugar;
	
	@Column(name="nombre", nullable=false, unique=true)
	private String nombre;
	
	@Column(name="descripcion", nullable=false)
	private String descripcion;
	
	@Column(name="latitud", nullable=false)
	private double latitud;
	
	@Column(name="longitud", nullable=false)
	private double longitud;
	
	@Column(name="fecha", nullable=false)
	private Date fecha;
	
	@Column(name="estado", nullable=false)
	private boolean estado;

	public long getIdlugar() {
		return idlugar;
	}

	public void setIdlugar(long idlugar) {
		this.idlugar = idlugar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
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
