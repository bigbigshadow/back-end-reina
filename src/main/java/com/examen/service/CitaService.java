package com.examen.service;

import java.util.Optional;

import com.examen.entity.Cita;


public interface CitaService {
	
	public Cita save(Cita cita);
	
	//READ ONE
	public Optional<Cita> findById(long id);
		
	//READ ALL
	public Iterable<Cita> findAll();
		
	//DELETE ONE
	public void deleteById(long id);
	
	//READ STATUS
	public Iterable<Cita> findByStatus(boolean status);
		
		
}
