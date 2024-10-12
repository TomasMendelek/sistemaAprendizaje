package com.backend.aprendizaje.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
@Data
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String email;
    private String tipo;
}
