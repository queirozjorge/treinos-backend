package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.exceptions.InvalidRequestException;
import br.com.jrqtech.treinos.models.entities.Treino;
import br.com.jrqtech.treinos.models.dto.TreinoRequest;
import br.com.jrqtech.treinos.models.dto.TreinoResponse;
import br.com.jrqtech.treinos.repositories.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TreinoService {

    @Autowired
    private ExercicioService exercicioService;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TreinoRepository treinoRepository;

    public TreinoResponse buscarTreino(Long id) {
        return TreinoResponse.getByEntity(
                treinoRepository.findById(id)
                        .orElseThrow(() -> new InvalidRequestException("Treino não encontrado")));
    }

    public List<TreinoResponse> buscarTreinoPorUsuario(String id) {
        return treinoRepository.findByUsuario(usuarioService.buscaUsuarioPorId(UUID.fromString(id)))
                .stream()
                .map(treino -> TreinoResponse.getByEntity(treino))
                .collect(Collectors.toList());
    }

    public TreinoResponse cadastrarTreino(TreinoRequest treinoRequest) {
        Treino treino = Treino.getByRequest(treinoRequest);
        treino.setExercicios(exercicioService.buscaExercicio(treinoRequest.getExerciciosId()));
        treino.setUsuario(usuarioService.buscaUsuarioPorId(UUID.fromString(treinoRequest.getUsuarioId())));
        return TreinoResponse.getByEntity(treinoRepository.save(treino));
    }

    public TreinoResponse atualizarTreino(Long id, TreinoRequest treinoRequest) {
        Treino treino = treinoRepository.findById(id).orElseThrow(() -> new InvalidRequestException("Treino não encontrado"));
        treino.setExercicios(exercicioService.buscaExercicio(treinoRequest.getExerciciosId()));
        return TreinoResponse.getByEntity(treinoRepository.save(treino));
    }

    public void deletarTreino(Long id) {
        Treino treino = treinoRepository.findById(id).orElseThrow(() -> new InvalidRequestException("Treino não encontrado"));
        treinoRepository.delete(treino);
    }

}
