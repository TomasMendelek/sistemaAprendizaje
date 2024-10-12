package com.backend.aprendizaje.controllers;

import com.backend.aprendizaje.models.Evaluacion;
import com.backend.aprendizaje.services.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluaciones")
public class EvaluacionController {

    @Autowired
    private EvaluacionService evaluacionService;

    @GetMapping
    public List<Evaluacion> getAllEvaluaciones() {
        return evaluacionService.getAllEvaluaciones();
    }

    @GetMapping("/{id}")
    public Evaluacion getEvaluacionById(@PathVariable String id) {
        return evaluacionService.getEvaluacionById(id);
    }

    @PostMapping
    public Evaluacion createEvaluacion(@RequestBody Evaluacion evaluacion) {
        return evaluacionService.createEvaluacion(evaluacion);
    }

    @DeleteMapping("/{id}")
    public void deleteEvaluacion(@PathVariable String id) {
        evaluacionService.deleteEvaluacion(id);
    }
}
