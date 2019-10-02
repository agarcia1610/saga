package com.saganet.quiz.dominios;

import org.apache.ibatis.type.Alias;

@Alias("EntidadDO")
public enum EntidadDO {
	AGUASCALIENTES("Aguascalientes"),
	BAJA_CALIFORNIA("Baja California"),
	BAJA_CALIFORNIA_SUR("Baja California Sur"),
	CAMPECHE("Campeche"),
	CHIAPAS("Chiapas"),
	CHIHUAHUA("Chihuahua"),
	COAHUILA("Coahuila"),
	COLIMA("Colima"),
	DISTRITO_FEDERAL("Distrito Federal"),
	DURANGO("Durango"),
	GUANAJUATO("Guanajuato"),
	GUERRERO("Guerrero"),
	HIDALGO("Hidalgo"),
	JALISCO("Jalisco"),
	MEXICO("México"),
	MICHOACAN("Michoacán"),
	MORELOS("Morelos"),
	NAYARIT("Nayarit"),
	NUEVO_LEON("Nuevo León"),
	OAXACA("Oaxaca"),
	PUEBLA("Puebla"),
	QUERETARO("Querétaro"),
	QUINTANA_ROO("Quintana Roo"),
	SAN_LUIS_POTOSI("San Luis Potosí"),
	SINALOA("Sinaloa"),
	SONORA("Sonora"),
	TABASCO("Tabasco"),
	TAMAULIPAS("Tamaulipas"),
	TLAXCALA("Tlaxcala"),
	VERACRUZ("Veracruz"),
	YUCATAN("Yucatán"),
	ZACATECAS("Zacatecas");
	
	private final String nombre;

	private EntidadDO(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	

}
