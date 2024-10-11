package com.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

import com.examen.repository.CitaRepository;
import com.examen.service.CitaService;

@SpringBootApplication(exclude = {JdbcTemplateAutoConfiguration.class})
public class ExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}
	


}
