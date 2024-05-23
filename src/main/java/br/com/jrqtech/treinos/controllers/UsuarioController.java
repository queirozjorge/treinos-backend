package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.dto.CadastroRequest;
import br.com.jrqtech.treinos.models.dto.UsuarioRequest;
import br.com.jrqtech.treinos.models.dto.UsuarioResponse;
import br.com.jrqtech.treinos.services.CadastroService;
import br.com.jrqtech.treinos.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private CadastroService cadastroService;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public ResponseEntity cadastrarUsuario(@RequestBody @Valid CadastroRequest cadastro) {
        cadastroService.cadastrarUsuario(cadastro);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/atualizar/{id}")
    public UsuarioResponse atualizarUsuario(
            @RequestBody @Valid UsuarioRequest usuario,
            @PathVariable String id) {
        return usuarioService.atualizarUsuario(id, usuario);
    }

}
