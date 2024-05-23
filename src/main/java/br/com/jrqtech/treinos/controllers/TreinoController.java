package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.dto.TreinoRequest;
import br.com.jrqtech.treinos.models.dto.TreinoResponse;
import br.com.jrqtech.treinos.services.TreinoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino")
public class TreinoController {

    @Autowired
    private TreinoService treinoService;

    @GetMapping("/{id}")
    public TreinoResponse buscarTreinoPorId(@PathVariable Long id) {
        return treinoService.buscarTreino(id);
    }

    @GetMapping("/usuario/{id}")
    public List<TreinoResponse> buscarTreinosPorUsuario(@PathVariable String id) {
        return treinoService.buscarTreinoPorUsuario(id);
    }

    @PostMapping("/cadastrar")
    public TreinoResponse cadastrarTreino(@RequestBody @Valid TreinoRequest treinoRequest) {
        return treinoService.cadastrarTreino(treinoRequest);
    }

    @PutMapping("/atualizar/{id}")
    public TreinoResponse atualizarTreino(
            @RequestBody @Valid TreinoRequest treinoRequest,
            @PathVariable Long id) {
        return treinoService.atualizarTreino(id, treinoRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarTreino(@PathVariable Long id) {
        treinoService.deletarTreino(id);
        return ResponseEntity.noContent().build();
    }

}
