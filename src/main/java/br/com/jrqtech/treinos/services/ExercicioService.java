package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.exceptions.InvalidRequestException;
import br.com.jrqtech.treinos.models.Entities.Exercicio;
import br.com.jrqtech.treinos.models.dto.ExercicioRequest;
import br.com.jrqtech.treinos.models.dto.ExercicioResponse;
import br.com.jrqtech.treinos.models.enums.GrupoMuscularEnum;
import br.com.jrqtech.treinos.repositories.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExercicioService {

    @Autowired
    private ExercicioRepository exercicioRepository;

    public List<ExercicioResponse> buscaExercicios() {
        return exercicioRepository.findAll().stream()
                .map(ex -> ExercicioResponse.getByEntity(ex))
                .collect(Collectors.toList());
    }

    public List<ExercicioResponse> buscaExerciciosPorGrupoMuscular(GrupoMuscularEnum grupoMuscular) {
        return exercicioRepository.findByGrupoMuscular(grupoMuscular).stream()
                .map(ex -> ExercicioResponse.getByEntity(ex))
                .collect(Collectors.toList());
    }

    public List<Exercicio> buscaExercicio(List<Long> ids) {
        return exercicioRepository.findAllById(ids);
    }

    public ExercicioResponse cadastrarNovoExercicio(ExercicioRequest exercicio) {
        return ExercicioResponse.getByEntity(exercicioRepository.save(Exercicio.getByRequest(exercicio)));
    }

    public ExercicioResponse atualizarExercicio(Long id, ExercicioRequest exercicio) {
        Exercicio exercicioEntity = exercicioRepository.findById(id).orElseThrow(() -> new InvalidRequestException("Exercício não encontrado"));
        exercicioEntity.setDescricao(exercicio.getDescricao());
        exercicioEntity.setGrupoMuscular(exercicio.getGrupoMuscular());
        return ExercicioResponse.getByEntity(exercicioRepository.save(exercicioEntity));
    }

    public void deletarExercicio(Long id) {
        Exercicio exercicioEntity = exercicioRepository.findById(id).orElseThrow(() -> new InvalidRequestException("Exercício não encontrado"));
        exercicioRepository.delete(exercicioEntity);
    }
}
