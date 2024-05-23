package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.dto.CadastroDTO;
import br.com.jrqtech.treinos.services.CadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/cadastrar")
    public ResponseEntity cadastro(@RequestBody @Valid CadastroDTO cadastro) {
        cadastroService.cadastrarUsuario(cadastro);
        return ResponseEntity.noContent().build();
    }

}
