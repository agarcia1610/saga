package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;

@Alias("EntityEO")
public class EntityEO extends EntityObject implements Serializable {

	private static final long serialVersionUID = -3457712605244462104L;
	
	private Integer id;
	private String name;
	
	
	@Override
	public String toString() {
		return "EntityEO [id=" + id + ", name=" + name + "]";
	}
	@Override
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
