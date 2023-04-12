package com.project.apimongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.project.apimongodb.controller", "com.project.apimongodb.model", "com.project.apimongodb.service", "com.project.apimongodb.repository"})
public class ApiMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMongodbApplication.class, args);
	}

}
