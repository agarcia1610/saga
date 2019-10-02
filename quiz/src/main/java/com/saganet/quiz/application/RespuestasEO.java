package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("RespuestasEO")
public class RespuestasEO extends EntityObject implements Serializable{


	private static final long serialVersionUID = -7642580832953625155L;
	
	private		Integer		id;
	private		Integer		valorNumerico;
	private		Integer		valorTexto;
	private		Integer		valorFecha;
	private		Integer		orden;
	
	
	@Override
	public String toString() {
		return "RespuestasEO [id=" + id + ", valorNumerico=" + valorNumerico + ", valorTexto=" + valorTexto
				+ ", valorFecha=" + valorFecha + ", orden=" + orden + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getValorNumerico() {
		return valorNumerico;
	}
	public void setValorNumerico(Integer valorNumerico) {
		this.valorNumerico = valorNumerico;
	}
	public Integer getValorTexto() {
		return valorTexto;
	}
	public void setValorTexto(Integer valorTexto) {
		this.valorTexto = valorTexto;
	}
	public Integer getValorFecha() {
		return valorFecha;
	}
	public void setValorFecha(Integer valorFecha) {
		this.valorFecha = valorFecha;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	
	
}
