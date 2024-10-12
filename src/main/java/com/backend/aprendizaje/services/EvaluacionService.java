package com.backend.aprendizaje.services;

import com.backend.aprendizaje.exceptions.ResourceNotFoundException;
import com.backend.aprendizaje.models.Evaluacion;
import com.backend.aprendizaje.repositories.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluacionService {

    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public List<Evaluacion> getAllEvaluaciones() {
        return evaluacionRepository.findAll();
    }

    public Evaluacion getEvaluacionById(String id) {
        return evaluacionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Evaluación no encontrada con ID: " + id));
    }

    public Evaluacion createEvaluacion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    // Método para eliminar una evaluación por ID
    public void deleteEvaluacion(String id) {
        if (!evaluacionRepository.existsById(id)) {
            throw new ResourceNotFoundException("Evaluación no encontrada con ID: " + id);
        }
        evaluacionRepository.deleteById(id);
    }
}
