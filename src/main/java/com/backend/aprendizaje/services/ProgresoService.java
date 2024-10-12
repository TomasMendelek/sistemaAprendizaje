package com.backend.aprendizaje.services;

import com.backend.aprendizaje.exceptions.ResourceNotFoundException;
import com.backend.aprendizaje.models.Progreso;
import com.backend.aprendizaje.repositories.ProgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgresoService {

    @Autowired
    private ProgresoRepository progresoRepository;

    public List<Progreso> getAllProgresos() {
        return progresoRepository.findAll();
    }

    public Progreso getProgresoById(String id) {
        return progresoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Progreso no encontrado con ID: " + id));
    }

    public Progreso createProgreso(Progreso progreso) {
        return progresoRepository.save(progreso);
    }

    // Método para eliminar un progreso por ID
    public void deleteProgreso(String id) {
        if (!progresoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Progreso no encontrado con ID: " + id);
        }
        progresoRepository.deleteById(id);
    }
}
