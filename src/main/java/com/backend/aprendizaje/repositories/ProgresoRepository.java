package com.backend.aprendizaje.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.aprendizaje.models.Progreso;

public interface ProgresoRepository extends MongoRepository<Progreso, String> {
}
