package com.proyect.main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sound.midi.Soundbank;

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

	
					//getAll
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
		
	return result;
	}
	
	
					//getOne
	@Override
	public PlanetaDTO getOne(int id) {
		
		Optional<Planeta> aOptional = planetaRepository.findById(id);
		
		PlanetaDTO temp = new PlanetaDTO();
		
		try {
			
			Planeta planeta = aOptional.get();
			
			temp.setId(planeta.getId());
			temp.setTamaño(planeta.getTamaño());
			temp.setNombre(planeta.getNombre());
			temp.setDencidad(planeta.getDencidad());
			
		} catch (Exception e) {
			System.out.println("No Existe el id");
		}
		return temp;
	}

	
					//save
	@Override
	public PlanetaDTO save(PlanetaDTO t) {
		Planeta planeta = new Planeta();
		
		planeta.setNombre(t.getNombre());
		planeta.setTamaño(t.getTamaño());
		planeta.setDencidad(t.getDencidad());
		
		try {
			
			planetaRepository.save(planeta);
				
			
		} catch (Exception e) {
		
			System.out.println("Bad Request");
		
		}
		t.setId(planeta.getId());
		
		return t;
	}

	
					//update
	@Override
	public PlanetaDTO update(PlanetaDTO t, int id) {
		
		Optional<Planeta> pOptional = planetaRepository.findById(id);
		
		Planeta temp = new Planeta();
		
		try {
			temp = pOptional.get();
			temp.setNombre(t.getNombre());
			temp.setDencidad(t.getDencidad());
			temp.setTamaño(t.getTamaño());
			
			planetaRepository.save(temp);
			t.setId(temp.getId());
			
		} catch (Exception e) {
			System.out.println("Bad Request");
			t.setId(0);
		}
		
		return t;
	}

	
					//delete
	@Override
	public boolean delete(int id) {
		try {
			
			planetaRepository.deleteById(id);
			
		} catch (Exception e) {
		
		}
	return true;
	}

}
