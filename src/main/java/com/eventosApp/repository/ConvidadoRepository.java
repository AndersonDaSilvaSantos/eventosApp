package com.eventosApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosApp.models.Convidado;
import com.eventosApp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
