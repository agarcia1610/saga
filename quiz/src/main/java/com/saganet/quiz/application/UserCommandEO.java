package com.saganet.quiz.application;



import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.saganet.database.EntityObject;

@Alias("UserCommandEO")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCommandEO extends EntityObject implements Serializable {

	  
	private static final long serialVersionUID = -3197767756641262418L;
	private  Integer	id;
	private  String 	nick;
	private  String 	nombre;
	private  String 	apellido_paterno;
	private  String 	apellido_materno;
	private  String 	password;
	private EntityEO 	entidad;
	private MunicipalityEO municipio;
	private  String		localidad;
	private  String		cp;
	private  String 	colonia;
	private  String 	calle;
	private	  String 	num_int;
	private	  String 	num_ext;
	
	
	@Override
	public String toString() {
		return "UserCommand [id=" + id + ", nick=" + nick + ", nombre=" + nombre + ", apellido_paterno="
				+ apellido_paterno + ", apellido_materno=" + apellido_materno + ", password=" + password + ", entidad="
				+ entidad + ", municipio=" + municipio + ", localidad=" + localidad + ", cp=" + cp + ", colonia="
				+ colonia + ", calle=" + calle + ", num_int=" + num_int + ", num_ext=" + num_ext + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EntityEO getEntidad() {
		return entidad;
	}
	public void setEntidad(EntityEO entidad) {
		this.entidad = entidad;
	}
	public MunicipalityEO getMunicipio() {
		return municipio;
	}
	public void setMunicipio(MunicipalityEO municipio) {
		this.municipio = municipio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
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
	public String getNum_int() {
		return num_int;
	}
	public void setNum_int(String num_int) {
		this.num_int = num_int;
	}
	public String getNum_ext() {
		return num_ext;
	}
	public void setNum_ext(String num_ext) {
		this.num_ext = num_ext;
	}
	
  
}
