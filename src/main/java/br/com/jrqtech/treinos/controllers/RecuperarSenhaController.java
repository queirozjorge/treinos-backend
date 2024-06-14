package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.services.RecuperarSenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recuperar-senha")
public class RecuperarSenhaController {

    @Autowired
    private RecuperarSenhaService recuperarSenhaService;

    @GetMapping
    public void enviarEmailRecuperarSenha(
            @RequestParam String email,
            @RequestParam String link) {
        recuperarSenhaService.enviarEmail(email, link);
    }

}
