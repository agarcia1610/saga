package com.saganet.quiz.dominios;

import org.apache.ibatis.type.Alias;

@Alias("TipoPreguntaDO")
public enum TipoPreguntaDO {
	ABIERTA("Abierta"),
	NUMERICA("Númerica"),
	ABIERTA_MULTIPLES_LINEAS("Abierta Múltiples Líneas"),
	TELEFONO("Telefóno"),
	CERRADA_MULTIPLE("Cerrada múltiples"),
	CERRADA_SIMPLE("Cerrada Simple"),
	CERRADA_FECHA("Cerrada fecha");
	
	private final String nombre;

	private TipoPreguntaDO(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
