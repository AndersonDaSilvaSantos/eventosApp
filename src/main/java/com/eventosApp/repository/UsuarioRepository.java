package com.eventosApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosApp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}
