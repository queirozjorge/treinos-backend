package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.exceptions.InvalidRequestException;
import br.com.jrqtech.treinos.models.entities.Usuario;
import br.com.jrqtech.treinos.models.dto.UsuarioRequest;
import br.com.jrqtech.treinos.models.dto.UsuarioResponse;
import br.com.jrqtech.treinos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Usuario buscaUsuarioPorId(UUID id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new InvalidRequestException("Usuário não encontrado"));
    }

    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email).orElseThrow(() -> new InvalidRequestException("Email não encontrado"));
    }

    public UsuarioResponse atualizarUsuario(String id, UsuarioRequest usuarioRequest) {
        Usuario usuario = usuarioRepository.findById(UUID.fromString(id)).orElseThrow(() -> new InvalidRequestException("Usuário não encontrado"));
        usuario.setDataNascimento(LocalDate.parse(usuarioRequest.getDataNascimento(), formatter));
        usuario.setNome(usuarioRequest.getNome());
        return UsuarioResponse.getByEntity(usuarioRepository.save(usuario));
    }

}
