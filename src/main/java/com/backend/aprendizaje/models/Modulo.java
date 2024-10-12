package com.backend.aprendizaje.models;
import java.util.List;
import lombok.Data;

@Data
public class Modulo {
    private String titulo;
    private List<Leccion> lecciones;
}
