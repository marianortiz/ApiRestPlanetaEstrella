package com.proyect.main.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.main.dtos.PlanetaDTO;
import com.proyect.main.services.PlanetaService;

@Controller
@RestController
@RequestMapping(path = "api/v1/planeta")
public class PlanetaController implements ObjectController<PlanetaDTO>{
	
	private PlanetaService planetaService;

	public PlanetaController(PlanetaService planetaService) {
		this.planetaService = planetaService;
	}

	@Override
	@CrossOrigin("*")
	@GetMapping(path = "/")
	public List<PlanetaDTO> getAll() {
		
		return ResponseEntity.status(200).body(planetaService.getAll()).getBody();
	}

	@Override
	public PlanetaDTO getOner(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity save(PlanetaDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity update(PlanetaDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
