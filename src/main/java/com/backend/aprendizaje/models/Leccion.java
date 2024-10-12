package com.backend.aprendizaje.models;

import lombok.Data;
import java.util.List;

@Data
public class Leccion {
    private String titulo;
    private List<Evaluacion> evaluaciones;
    private Resultado resultado;
}
