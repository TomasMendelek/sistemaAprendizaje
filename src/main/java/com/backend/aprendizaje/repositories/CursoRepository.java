package com.backend.aprendizaje.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.aprendizaje.models.Curso;

public interface CursoRepository extends MongoRepository<Curso, String> {
}
