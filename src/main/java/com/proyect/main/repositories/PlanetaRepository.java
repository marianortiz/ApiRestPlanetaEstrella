package com.proyect.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.main.entidades.Planeta;


@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Integer>{
	
	
	
}
