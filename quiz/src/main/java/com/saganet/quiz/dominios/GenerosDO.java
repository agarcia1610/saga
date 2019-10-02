package com.saganet.quiz.dominios;

import org.apache.ibatis.type.Alias;

@Alias("GenerosDO")
public enum GenerosDO {
	MASCULINO("Masculino"),
	FEMENINO("Femenino"),
	NO_ESPECIFICADO("No Especificado");
	
	private final String nombre;

	private GenerosDO(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
