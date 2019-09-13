package com.proyect.main.dtos;

import java.io.Serializable;

public class PlanetaDTO implements Serializable {

	private int id;
	private String nombre;
	private String dencidad;
	private float tamaño;
	
	
	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDencidad() {
		return dencidad;
	}
	public void setDencidad(String dencidad) {
		this.dencidad = dencidad;
	}
	public float getTamaño() {
		return tamaño;
	}
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	
	//CONSTRUNCTOR PLANETADTO
	public PlanetaDTO(String nombre, String dencidad, float tamaño) {
		this.nombre = nombre;
		this.dencidad = dencidad;
		this.tamaño = tamaño;
	}
	public PlanetaDTO() {
	}
	
	
	
}
