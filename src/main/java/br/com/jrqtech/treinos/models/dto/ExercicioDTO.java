package br.com.jrqtech.treinos.models.dto;

import br.com.jrqtech.treinos.models.Entities.Exercicio;
import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioDTO {

    private String descricao;

    @JsonProperty("grupo_muscular")
    private GrupoMuscular grupoMuscular;

    public static ExercicioDTO getByEntity(Exercicio exercicio) {
        return ExercicioDTO.builder()
                .descricao(exercicio.getDescricao())
                .grupoMuscular(exercicio.getGrupoMuscular())
                .build();
    }

}
