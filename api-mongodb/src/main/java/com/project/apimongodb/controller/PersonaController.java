package com.project.apimongodb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.apimongodb.model.Persona;
import com.project.apimongodb.service.PersonaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PersonaController {
	
	private final PersonaService personaService;
	
	@PostMapping("/personas")
	public void save(@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
	@GetMapping("/personas")
	public List<Persona> findAll(){
		return personaService.findAll();
	}
	
	@GetMapping("/persona/{id}")
	public Persona findById(@PathVariable String id) {
		return personaService.findById(id).get();
	}
	
	@DeleteMapping("persona/{id}")
	public void deleteById(@PathVariable String id) {
		personaService.deleteById(id);
	}
	
	@PutMapping("/personas")
	public void update(@RequestBody Persona persona) {
		personaService.save(persona);
	}

}
