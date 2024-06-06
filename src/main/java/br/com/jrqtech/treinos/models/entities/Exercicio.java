package br.com.jrqtech.treinos.models.entities;

import br.com.jrqtech.treinos.models.dto.ExercicioRequest;
import br.com.jrqtech.treinos.models.enums.GrupoMuscularEnum;
import br.com.jrqtech.treinos.models.enums.GrupoMuscularConverter;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exercicio")
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Column(name = "grupo_muscular")
    @Convert(converter = GrupoMuscularConverter.class)
    private GrupoMuscularEnum grupoMuscular;

    public static Exercicio getByRequest(ExercicioRequest exercicio) {
        return Exercicio.builder()
                .descricao(exercicio.getDescricao())
                .grupoMuscular(exercicio.getGrupoMuscular())
                .build();
    }
}
