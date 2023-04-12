package com.project.apimongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.apimongodb.model.Persona;
import com.project.apimongodb.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonaService {
	private final PersonaRepository personaRepository;
	
	public void save (Persona persona) {
		personaRepository.save(persona);
	}
	
	public List<Persona> findAll(){
		return personaRepository.findAll();
	}
	
	public Optional<Persona> findById(String id) {
		return personaRepository.findById(id);
	}
	
	public void deleteById(String id) {
		personaRepository.deleteById(id);
	}
}
