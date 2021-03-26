package com.eventosApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosApp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
	Evento findByCodigo(long codigo);
}
