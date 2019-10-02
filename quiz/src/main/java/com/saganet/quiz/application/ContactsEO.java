package com.saganet.quiz.application;

import java.io.Serializable;
import java.sql.Date;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;
import com.saganet.quiz.dominios.GenerosDO;

@Alias("ContactsEO")
public class ContactsEO extends EntityObject implements Serializable{


	private static final long serialVersionUID = 8798023210871907579L;
	
	private		Integer			id;
	private 	UserCommandEO	idUsuario;
	private 	EncuestaEO		idEncuesta;
	private 	String			nombre;
	private 	String			apellidoPaterno;
	private 	String			apellidoMaterno;
	private 	String			ine;
	private		EntityEO		idEntidad;
	private 	MunicipalityEO	idMunicipio;
	private		String			localidad;
	private		String			colonia;
	private		String			calle;
	private		Date			fechaNac;
	private		GenerosDO		genero;
	
	
	@Override
	public String toString() {
		return "ContactsEO [id=" + id + ", idUsuario=" + idUsuario + ", idEncuesta=" + idEncuesta + ", nombre=" + nombre
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", ine=" + ine
				+ ", idEntidad=" + idEntidad + ", idMunicipio=" + idMunicipio + ", localidad=" + localidad
				+ ", colonia=" + colonia + ", calle=" + calle + ", fechaNac=" + fechaNac + ", genero=" + genero + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserCommandEO getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(UserCommandEO idUsuario) {
		this.idUsuario = idUsuario;
	}
	public EncuestaEO getIdEncuesta() {
		return idEncuesta;
	}
	public void setIdEncuesta(EncuestaEO idEncuesta) {
		this.idEncuesta = idEncuesta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getIne() {
		return ine;
	}
	public void setIne(String ine) {
		this.ine = ine;
	}
	public EntityEO getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(EntityEO idEntidad) {
		this.idEntidad = idEntidad;
	}
	public MunicipalityEO getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(MunicipalityEO idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public GenerosDO getGenero() {
		return genero;
	}
	public void setGenero(GenerosDO genero) {
		this.genero = genero;
	}
	
	

}
