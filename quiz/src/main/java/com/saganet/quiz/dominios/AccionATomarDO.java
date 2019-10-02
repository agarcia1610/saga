package com.saganet.quiz.dominios;

import org.apache.ibatis.type.Alias;

@Alias("AccionATomarDO")
public enum AccionATomarDO {
	SIGUIENTE("Siguiente"),
	IR_A("Ir a"),
	TERMINAR("Terminar"),
	TERMINAR_MOTIVO("Terminar motivo");
	
	private final String nombre;

	private AccionATomarDO(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

}
