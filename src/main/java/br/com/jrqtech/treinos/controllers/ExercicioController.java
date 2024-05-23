package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.dto.ExercicioRequest;
import br.com.jrqtech.treinos.models.dto.ExercicioResponse;
import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import br.com.jrqtech.treinos.services.ExercicioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioService exercicioService;

    @GetMapping
    public List<ExercicioResponse> buscaExercicios() {
        return exercicioService.buscaExercicios();
    }

    @GetMapping("/grupo-muscular/{id}")
    public List<ExercicioResponse> buscaExerciciosPorGrupoMuscular(@PathVariable("id") Integer id) {
        return exercicioService.buscaExerciciosPorGrupoMuscular(GrupoMuscular.get(id));
    }

    @PostMapping
    public ExercicioResponse cadastrarNovoExercicio(@RequestBody @Valid ExercicioRequest exercicio) {
        return exercicioService.cadastrarNovoExercicio(exercicio);
    }

    @PutMapping("/{id}")
    public ExercicioResponse atualizarExercicio(
            @RequestBody @Valid ExercicioRequest exercicio,
            @PathVariable("id") Long id) {
        return exercicioService.atualizarExercicio(id, exercicio);
    }

}
