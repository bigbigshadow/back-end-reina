package com.examen.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Cita;
import com.examen.service.CitaService;





@CrossOrigin(origins = "*")
@RestController 
public class CitaController {
	
	@Autowired
	CitaService citaService;
	
	
	@PostMapping("/cita")
	public ResponseEntity<?> save(@RequestBody Cita cita) 
	{
		System.out.println(cita.toString());
			return  ResponseEntity.status(HttpStatus.CREATED).body(citaService.save(cita));
	
		

	}
	
	// READ ONE
		@GetMapping("/cita/{id}")
		public Optional<Cita> findById(@PathVariable(value = "id") Integer id) {
	 
			return citaService.findById(id);
		}
		
		
		@PutMapping("/cita")
		public ResponseEntity<?> update(@RequestBody Cita cita) 
		{
				return  ResponseEntity.status(HttpStatus.CREATED).body(citaService.save(cita));
		
			

		}
		
		@DeleteMapping("/cita/{id}")
		public ResponseEntity<?> deleteById(@PathVariable(value = "id") long id) {
			Cita resp= new Cita();
			resp=citaService.findById(id).get();
			resp.setStatus(false);
			return ResponseEntity.status(HttpStatus.CREATED).body(citaService.save(resp));
		}
		
		@GetMapping("/cita/status/{status}")
		public Iterable<Cita> findAllStatus(@PathVariable(value = "status") boolean status) {
			return citaService.findByStatus(status);
		}
		
		@GetMapping("/cita")
		public Iterable<Cita> findAll() {
			return citaService.findAll();
		}
		
	


}
