package br.com.jrqtech.treinos.models.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    @NotNull(message = "Email obrigatório")
    private String email;

    @NotNull(message = "Senha obrigatória")
    private String password;

}
