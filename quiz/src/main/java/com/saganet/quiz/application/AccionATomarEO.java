package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
import com.saganet.database.EntityObject;


@Alias("AccionATomarEO")
public class AccionATomarEO  extends EntityObject implements Serializable{
	

	private static final long serialVersionUID = -6832583860951563239L;
	private	Integer		id;
	private	String		tipAccion;
	private	String		siguiente;
	private	String		irA;
	private	String		terminar;
	private String		terminarMotivo;
	
	
	@Override
	public String toString() {
		return "AccionATomarEO [id=" + id + ", tipAccion=" + tipAccion + ", siguiente=" + siguiente + ", irA=" + irA
				+ ", terminar=" + terminar + ", terminarMotivo=" + terminarMotivo + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipAccion() {
		return tipAccion;
	}
	public void setTipAccion(String tipAccion) {
		this.tipAccion = tipAccion;
	}
	public String getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(String siguiente) {
		this.siguiente = siguiente;
	}
	public String getIrA() {
		return irA;
	}
	public void setIrA(String irA) {
		this.irA = irA;
	}
	public String getTerminar() {
		return terminar;
	}
	public void setTerminar(String terminar) {
		this.terminar = terminar;
	}
	public String getTerminarMotivo() {
		return terminarMotivo;
	}
	public void setTerminarMotivo(String terminarMotivo) {
		this.terminarMotivo = terminarMotivo;
	}
	
	
}
