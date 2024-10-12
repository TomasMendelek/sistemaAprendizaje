package com.backend.aprendizaje.services;

import com.backend.aprendizaje.exceptions.ResourceNotFoundException;
import com.backend.aprendizaje.models.Curso;
import com.backend.aprendizaje.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(String id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Curso no encontrado con ID: " + id));
    }

    public Curso createCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
}
