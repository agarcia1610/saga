package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("SeccionEO")
public class SeccionEO extends EntityObject implements Serializable {


	private static final long serialVersionUID = 9154886000088507464L;
	
	private		Integer		id;
	private		Integer		idEncuesta;
	private		String		nombreSccion;
	
	
	@Override
	public String toString() {
		return "SeccionEO [id=" + id + ", idEncuesta=" + idEncuesta + ", nombreSccion=" + nombreSccion + "]";
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
	public String getNombreSccion() {
		return nombreSccion;
	}
	public void setNombreSccion(String nombreSccion) {
		this.nombreSccion = nombreSccion;
	}
	
	

}
