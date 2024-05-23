package br.com.jrqtech.treinos.models.dto;

import br.com.jrqtech.treinos.models.enums.DiaSemanaEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreinoRequest {

    @NotNull(message = "Dia da semana obrigatório")
    @JsonProperty("dia_semana")
    private DiaSemanaEnum diaSemana;

    @NotNull(message = "Exercícios obrigatório")
    @JsonProperty("exercicios_id")
    private List<Long> exerciciosId;

    @NotNull(message = "Usuário obrigatório") @NotBlank(message = "Usuário obrigatório")
    @JsonProperty("usuario_id")
    private String usuarioId;

}
