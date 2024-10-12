package com.backend.aprendizaje.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.backend.aprendizaje.models.Evaluacion;

public interface EvaluacionRepository extends MongoRepository<Evaluacion, String> {
}
