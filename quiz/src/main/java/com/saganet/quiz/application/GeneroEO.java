package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;


@Alias("GeneroEO")
public class GeneroEO  extends EntityObject implements Serializable{
	
	
	private static final long serialVersionUID = 4896881930275741098L;
	Integer		id;
	String 		genero;
	
	
	@Override
	public String toString() {
		return "GeneroEO [id=" + id + ", genero=" + genero + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
