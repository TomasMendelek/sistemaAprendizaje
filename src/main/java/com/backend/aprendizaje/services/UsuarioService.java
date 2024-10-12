package com.backend.aprendizaje.services;

import com.backend.aprendizaje.exceptions.ResourceNotFoundException;
import com.backend.aprendizaje.models.Usuario;
import com.backend.aprendizaje.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(String id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con ID: " + id));
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
