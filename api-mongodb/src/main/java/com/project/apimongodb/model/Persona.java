package com.project.apimongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "Persona")
@Data
public class Persona {
	@Id
	private String id;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;

}
