package com.proyect.main.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.main.dtos.PlanetaDTO;
import com.proyect.main.exceptions.StatusException;
import com.proyect.main.services.PlanetaService;

@Controller
@RestController
@RequestMapping(path = "api/v1/planeta")
public class PlanetaController implements ObjectController<PlanetaDTO>{
	
	private PlanetaService planetaService;

	public PlanetaController(PlanetaService planetaService) {
		this.planetaService = planetaService;
	}
		
	
					//getALL
	@Override
	@CrossOrigin("*")
	@GetMapping(path = "/")
	public List<PlanetaDTO> getAll() {
		
		return ResponseEntity.status(200).body(planetaService.getAll()).getBody();
	}
	
	
					//getOne
	@Override
	@GetMapping("/{id}")
	public PlanetaDTO getOner(@PathVariable int id) {
		return ResponseEntity.status(200).body(planetaService.getOne(id)).getBody();
	}
	
	
					//save
	@Override
	@PostMapping("/")
	public ResponseEntity save(@RequestBody PlanetaDTO t) {
		
		PlanetaDTO temp = planetaService.save(t);
		try {
			
			if(temp.getId() != 0 ) {
			
				return ResponseEntity.status(201).body(temp);
			
			}else {
			
			throw new StatusException("Nombre ya existente", 400);
			
			}	
		} catch (StatusException e) {
			
			return e.getResponseStatus();
		
		}
		
	}

	
					//update
	@Override
	@PutMapping("/{id}")
	public ResponseEntity update(@RequestBody PlanetaDTO t, @PathVariable int id) {
		
		PlanetaDTO temp = planetaService.update(t, id);
		
		try {
			if(temp.getId() != 0 ) {
				return ResponseEntity.status(201).body(temp);
			}else {
				throw new StatusException("Solicitud Incorrecta", 400);
			}
		
		} catch (StatusException e) {
			
			return e.getResponseStatus();
		
		}
	}
	
	
					//delete
	@Override
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable int id) {
		
		boolean det = planetaService.delete(id);
		
		try {
			if(det) {
				return  ResponseEntity.status(200).body("{\"Eliminacion Existosa\" : \"Removido Coreectamente.\" }");
			}else {
				
				throw new StatusException("Solicitud Incorrecta", 400);
			}
		
		} catch (StatusException e) {
			
			return e.getResponseStatus();
			
		}
	}
	
}

























