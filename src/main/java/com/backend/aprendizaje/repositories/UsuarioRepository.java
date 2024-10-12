package com.backend.aprendizaje.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.aprendizaje.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
