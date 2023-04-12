package com.project.apimongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.apimongodb.model.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, String> {

}
