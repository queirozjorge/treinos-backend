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
public class CadastroRequest {

    @NotNull(message = "Nome obrigatório") @NotBlank(message = "Nome obrigatório")
    private String nome;

    @NotNull(message = "Senha obrigatória") @NotBlank(message = "Senha obrigatória")
    private String password;

    @NotNull(message = "Email obrigatório") @NotBlank(message = "Email obrigatório")
    private String email;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$", message = "Formato de data incorreto")
    private String dataNascimento;

}
