package br.com.jrqtech.treinos.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treino")
public class TreinoController {

    @PostMapping("/cadastrar")
    public String cadastrarTreino() {
        return "Treino cadastrado com sucesso";
    }

}
