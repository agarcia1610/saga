package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("MobileEO")
public class MobileEO extends EntityObject implements Serializable{
	

	private static final long serialVersionUID = 7537071138170420595L;
	private 	Integer id;
	private		UserCommandEO idUsuario;
	private		String	celular;
	
	
	@Override
	public String toString() {
		return "MobileEO [id=" + id + ", idUsuario=" + idUsuario + ", celular=" + celular + "]";
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	

}
