package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.models.dto.ExercicioDTO;
import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import br.com.jrqtech.treinos.repositories.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExercicioService {

    @Autowired
    private ExercicioRepository exercicioRepository;

    public List<ExercicioDTO> buscaExercicios() {
        return exercicioRepository.findAll().stream()
                .map(ex -> ExercicioDTO.getByEntity(ex))
                .collect(Collectors.toList());
    }

    public List<ExercicioDTO> buscaExerciciosPorGrupoMuscular(GrupoMuscular grupoMuscular) {
        return exercicioRepository.findByGrupoMuscular(grupoMuscular).stream()
                .map(ex -> ExercicioDTO.getByEntity(ex))
                .collect(Collectors.toList());
    }

}
