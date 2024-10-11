package com.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.entity.Cita;


@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {
	Iterable<Cita> findByStatus(boolean status);
}
