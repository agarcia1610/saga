package com.saganet.quiz.application;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import com.saganet.database.EntityObject;


@Alias("MunicipalityEO")
public class MunicipalityEO extends EntityObject implements Serializable {

	private static final long serialVersionUID = -6686941829861447512L;
	private Integer id;
	private String name;
	private EntityEO entity;
	
	
	@Override
	public String toString() {
		return "MunicipalityEO [id=" + id + ", name=" + name + ", entity=" + entity + "]";
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
	public EntityEO getEntity() {
		return entity;
	}
	public void setEntity(EntityEO entity) {
		this.entity = entity;
	}
}
