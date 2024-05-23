package br.com.jrqtech.treinos.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequest {

    @NotNull(message = "Nome obrigatório") @NotBlank(message = "Nome obrigatório")
    private String nome;

    @NotNull(message = "Sobrenome obrigatório") @NotBlank(message = "Sobrenome obrigatório")
    private String sobrenome;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$", message = "Formato de data incorreto")
    private String dataNascimento;

}
