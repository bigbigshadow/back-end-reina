package com.examen.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Cita;
import com.examen.repository.CitaRepository;
import com.examen.service.CitaService;

@Service
public class CitaImpl implements CitaService {
	
	@Autowired
	CitaRepository citaRepository;

	@Override
	public Cita save(Cita cita) {
		// TODO Auto-generated method stub
		return citaRepository.save(cita);
	}

	@Override
	public Optional<Cita> findById(long id) {
		// TODO Auto-generated method stub
		return citaRepository.findById(id);
	}

	@Override
	public Iterable<Cita> findAll() {
		// TODO Auto-generated method stub
		return citaRepository.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<Cita> findByStatus(boolean status) {
		// TODO Auto-generated method stub
		return citaRepository.findByStatus(status);
	}



}
