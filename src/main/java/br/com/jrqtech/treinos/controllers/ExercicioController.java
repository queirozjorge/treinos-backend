package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.dto.ExercicioDTO;
import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import br.com.jrqtech.treinos.services.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioService exercicioService;

    @GetMapping()
    public List<ExercicioDTO> buscaExercicios() {
        return exercicioService.buscaExercicios();
    }

    @GetMapping("/grupo-muscular/{id}")
    public List<ExercicioDTO> buscaExerciciosPorGrupoMuscular(@PathVariable("id") Integer id) {
        return exercicioService.buscaExerciciosPorGrupoMuscular(GrupoMuscular.get(id));
    }

}
