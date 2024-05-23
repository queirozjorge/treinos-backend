package br.com.jrqtech.treinos.models.dto;

import br.com.jrqtech.treinos.models.Entities.Treino;
import br.com.jrqtech.treinos.models.enums.DiaSemanaEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreinoResponse {

    @JsonProperty("dia_semana")
    private DiaSemanaEnum diaSemana;

    @JsonProperty("exercicios_id")
    private List<Long> exerciciosId;

    @JsonProperty("usuario_id")
    private String usuarioId;

    public static TreinoResponse getByEntity(Treino treino) {
        return TreinoResponse.builder()
                .diaSemana(treino.getDiaSemana())
                .exerciciosId(treino.getExercicios().stream().map(id -> id.getId()).collect(Collectors.toList()))
                .usuarioId(treino.getUsuario().getId().toString())
                .build();
    }
}
