package com.proyect.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.proyect.main.dtos.PlanetaDTO;
import com.proyect.main.entidades.Planeta;
import com.proyect.main.repositories.PlanetaRepository;


@Service
public class PlanetaService implements ObjectService<PlanetaDTO>{

	private PlanetaRepository planetaRepository;
	
	
	
	public PlanetaService(PlanetaRepository planetaRepository) {
		this.planetaRepository = planetaRepository;
	}

	
	
	@Override
	public List<PlanetaDTO> getAll() {
		
		List<PlanetaDTO> result = new ArrayList<>();
		for(Planeta planeta : planetaRepository.findAll()) {
			PlanetaDTO temp = new PlanetaDTO();
			temp.setId(planeta.getId());
			temp.setNombre(planeta.getNombre());
			temp.setDencidad(planeta.getDencidad());
			temp.setTamaño(planeta.getTamaño());
			result.add(temp);
			
			
			
			
		}
		
		return null;
	}

	@Override
	public PlanetaDTO getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanetaDTO save(PlanetaDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanetaDTO update(PlanetaDTO t, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
