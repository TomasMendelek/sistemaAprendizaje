package com.backend.aprendizaje.models;
import lombok.Data;
import java.util.List;

@Data
public class Evaluacion {
    private String titulo;
    private List<Pregunta> preguntas;
}
