package com.proyect.main.entidades;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "planetaEstrella_estrella")
public class Estrella {

	
	@Id
	@Column(name = "estrella_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "estrella_nombre")
	private String nombre;
	
	@Column(name = "estrella_dencidad")
	private int densidad;
	
	
	@OneToMany(mappedBy = "estrella", cascade = CascadeType.ALL, orphanRemoval = true )
	private ArrayList<Planeta> planeta = new ArrayList();

	
	//CONSTRUCTOR ESTRELLA
	public Estrella(int id, String nombre, int densidad) {
		this.id = id;
		this.nombre = nombre;
		this.densidad = densidad;
	}

	public Estrella() {
	
	}
	
	//GETTERS AND SETTERS
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

	public int getDensidad() {
		return densidad;
	}

	public void setDensidad(int densidad) {
		this.densidad = densidad;
	}
	
	
}
	
	