package com.is3.SUCWS.model;

import java.sql.Date;

import com.is3.SUCWS.entity.Lugar;

public class LugarModel {
	
	public LugarModel(long idlugar, String nombre, String descripcion, double latitud, double longitud, Date fecha,
			boolean estado) {
	
		this.idlugar = idlugar;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.fecha = fecha;
		this.estado = estado;
	}
	
	public LugarModel(Lugar lugar) {
	
		this.idlugar = lugar.getIdlugar();
		this.nombre = lugar.getNombre();
		this.descripcion = lugar.getDescripcion();
		this.latitud = lugar.getLatitud();
		this.longitud = lugar.getLongitud();
		this.fecha = lugar.getFecha();
		this.estado = lugar.isEstado();
	}
	
	public LugarModel() {}
	
	private long idlugar;
	private String nombre;
	private String descripcion;
	private double latitud;
	private double longitud;
	private Date fecha;
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
