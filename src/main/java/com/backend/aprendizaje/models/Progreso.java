package com.backend.aprendizaje.models;
import lombok.Data;
import java.util.List;

@Data
public class Progreso {
    private String estudianteId;
    private List<Resultado> resultados;
}
