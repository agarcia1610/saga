package com.saganet.quiz.application;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("EncuestaEO")
public class EncuestaEO extends EntityObject implements Serializable {


	private static final long serialVersionUID = 2303603227388113495L;
	private		Integer		id;
	private 	String		nombre;
	private		String		observaciones;
	private 	Date		fechaInicio;
	private 	Date 		fechaFin;
	private		Integer		version;
	private		Boolean		activa;
	
	
	@Override
	public String toString() {
		return "EncuestaEO [id=" + id + ", nombre=" + nombre + ", observaciones=" + observaciones + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", version=" + version + ", activa=" + activa + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Boolean getActiva() {
		return activa;
	}
	public void setActiva(Boolean activa) {
		this.activa = activa;
	}
	
	

}
