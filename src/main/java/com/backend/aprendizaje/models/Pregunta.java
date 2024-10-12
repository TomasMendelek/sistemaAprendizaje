package com.backend.aprendizaje.models;
import java.util.List;

import lombok.Data;

@Data
public class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;
    private List<String> opciones;
}
