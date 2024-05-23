package br.com.jrqtech.treinos.models.dto;

import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExercicioRequest {

    @NotNull(message = "Descrição obrigatória") @NotBlank(message = "Descrição obrigatória")
    private String descricao;

    @NotNull(message = "Grupo muscular obrigatório")
    @JsonProperty("grupo_muscular")
    private GrupoMuscular grupoMuscular;

}
