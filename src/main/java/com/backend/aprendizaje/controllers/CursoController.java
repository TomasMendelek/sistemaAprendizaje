package com.backend.aprendizaje.controllers;

import com.backend.aprendizaje.models.Curso;
import com.backend.aprendizaje.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.createCurso(curso);
    }

    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable String id) {
        return cursoService.getCursoById(id);
    }
}
