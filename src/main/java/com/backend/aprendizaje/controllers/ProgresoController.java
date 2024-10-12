package com.backend.aprendizaje.controllers;

import com.backend.aprendizaje.models.Progreso;
import com.backend.aprendizaje.services.ProgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progresos")
public class ProgresoController {

    @Autowired
    private ProgresoService progresoService;

    @GetMapping
    public List<Progreso> getAllProgresos() {
        return progresoService.getAllProgresos();
    }

    @GetMapping("/{id}")
    public Progreso getProgresoById(@PathVariable String id) {
        return progresoService.getProgresoById(id);
    }

    @PostMapping
    public Progreso createProgreso(@RequestBody Progreso progreso) {
        return progresoService.createProgreso(progreso);
    }

    @DeleteMapping("/{id}")
    public void deleteProgreso(@PathVariable String id) {
        progresoService.deleteProgreso(id);
    }
}
