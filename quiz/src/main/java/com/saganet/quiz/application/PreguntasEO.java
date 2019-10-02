package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("PreguntasEO")
public class PreguntasEO extends EntityObject implements Serializable{

	private static final long serialVersionUID = 6107886401755215905L;
	
	private		Integer		id;
	private		Integer		idEncuesta;
	private		Integer		idSeccion;
	private		Integer		numeroPregunta;
	private		Integer		idTipoPregunta;
	private		String		pregunta;
	private		Integer		idAccionATomar;
	private		Boolean		obligatoria;
	
	
	@Override
	public String toString() {
		return "PreguntasEO [id=" + id + ", idEncuesta=" + idEncuesta + ", idSeccion=" + idSeccion + ", numeroPregunta="
				+ numeroPregunta + ", idTipoPregunta=" + idTipoPregunta + ", pregunta=" + pregunta + ", idAccionATomar="
				+ idAccionATomar + ", obligatoria=" + obligatoria + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdEncuesta() {
		return idEncuesta;
	}
	public void setIdEncuesta(Integer idEncuesta) {
		this.idEncuesta = idEncuesta;
	}
	public Integer getIdSeccion() {
		return idSeccion;
	}
	public void setIdSeccion(Integer idSeccion) {
		this.idSeccion = idSeccion;
	}
	public Integer getNumeroPregunta() {
		return numeroPregunta;
	}
	public void setNumeroPregunta(Integer numeroPregunta) {
		this.numeroPregunta = numeroPregunta;
	}
	public Integer getIdTipoPregunta() {
		return idTipoPregunta;
	}
	public void setIdTipoPregunta(Integer idTipoPregunta) {
		this.idTipoPregunta = idTipoPregunta;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public Integer getIdAccionATomar() {
		return idAccionATomar;
	}
	public void setIdAccionATomar(Integer idAccionATomar) {
		this.idAccionATomar = idAccionATomar;
	}
	public Boolean getObligatoria() {
		return obligatoria;
	}
	public void setObligatoria(Boolean obligatoria) {
		this.obligatoria = obligatoria;
	}
	

}
