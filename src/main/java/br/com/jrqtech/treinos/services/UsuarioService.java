package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.exceptions.InvalidRequestException;
import br.com.jrqtech.treinos.models.Entities.Usuario;
import br.com.jrqtech.treinos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario buscaUsuarioPorId(UUID id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new InvalidRequestException("Usuário não encontrado"));
    }

}
