package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.exceptions.InvalidRequestException;
import br.com.jrqtech.treinos.models.Entities.Usuario;
import br.com.jrqtech.treinos.models.dto.CadastroRequest;
import br.com.jrqtech.treinos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Service
public class CadastroService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void cadastrarUsuario(CadastroRequest cadastro) {

        usuarioRepository.findByEmail(cadastro.getEmail())
                .ifPresent(email -> new InvalidRequestException("Email já cadastrado"));

        usuarioRepository.save(
                Usuario.builder()
                    .nome(cadastro.getNome())
                    .sobrenome(cadastro.getSobrenome())
                    .password(encode(cadastro.getPassword()))
                    .email(cadastro.getEmail())
                    .dataNascimento(LocalDate.parse(cadastro.getDataNascimento(), formatter))
                    .build());
    }

    private String encode(String senha) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(senha);
    }

}
