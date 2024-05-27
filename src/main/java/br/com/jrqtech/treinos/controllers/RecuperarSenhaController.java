package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.services.RecuperarSenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recuperar-senha")
public class RecuperarSenhaController {

    @Autowired
    private RecuperarSenhaService recuperarSenhaService;

    @PostMapping
    public void enviarEmailRecuperarSenha(
            @RequestParam String email,
            @RequestParam String link) {
        recuperarSenhaService.enviarEmail(email, link);
    }

}
