package com.backend.aprendizaje.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "cursos")
@Data
public class Curso {
    @Id
    private String id;
    private String titulo;
    private List<Modulo> modulos;
}
