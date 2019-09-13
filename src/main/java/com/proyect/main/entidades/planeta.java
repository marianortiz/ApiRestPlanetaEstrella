package com.proyect.main.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "planetaestrella_planeta") 
public class Planeta {
	
	@Id
	@Column(name = "planet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "planet_nombre",unique = true)
	private String nombre;
	@Column(name = "planet_dencidad")
	private String dencidad;
	@Column(name = "planet_tamaño")
	private float tamaño;
	
	//CONSTRUCTOR PLANETA
	public Planeta(String nombre, String dencidad, float tamaño) {
		this.nombre = nombre;
		this.dencidad = dencidad;
		this.tamaño = tamaño;
	}
	
	public Planeta() {
	}

	//GETTERS AND SETTERS
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
