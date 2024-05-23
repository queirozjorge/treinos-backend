package br.com.jrqtech.treinos.models.Entities;

import br.com.jrqtech.treinos.models.dto.TreinoRequest;
import br.com.jrqtech.treinos.models.enums.DiaSemanaEnum;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "treino")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dia_semana")
    private DiaSemanaEnum diaSemana;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Exercicio> exercicios;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    public static Treino getByRequest(TreinoRequest request) {
        return Treino.builder()
                .diaSemana(request.getDiaSemana())
                .build();
    }

}
