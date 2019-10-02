package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("RedesSocialesEO")
public class RedesSocialesEO extends EntityObject implements Serializable {


	private static final long serialVersionUID = 5024023081049217948L;
	
	private		Integer		id;
	private 	Integer		idUsuario;
	private		Integer		tipoRedSocial;
	private		String		redSocial;
	
	
	
	@Override
	public String toString() {
		return "RedesSocialesEO [id=" + id + ", idUsuario=" + idUsuario + ", tipoRedSocial=" + tipoRedSocial
				+ ", redSocial=" + redSocial + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getTipoRedSocial() {
		return tipoRedSocial;
	}
	public void setTipoRedSocial(Integer tipoRedSocial) {
		this.tipoRedSocial = tipoRedSocial;
	}
	public String getRedSocial() {
		return redSocial;
	}
	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}
	
	
}
