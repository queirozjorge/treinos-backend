package br.com.jrqtech.treinos.models.dto;

import br.com.jrqtech.treinos.models.Entities.Usuario;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponse {

    private String nome;

    private String sobrenome;

    @JsonRawValue
    @JsonProperty("data_nascimento")
    private LocalDate dataNascimento;

    public static UsuarioResponse getByEntity(Usuario usuario) {
        return UsuarioResponse.builder()
                .nome(usuario.getNome())
                .sobrenome(usuario.getSobrenome())
                .dataNascimento(usuario.getDataNascimento())
                .build();
    }

}
