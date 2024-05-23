package br.com.jrqtech.treinos.models.Entities;

import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
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
    private GrupoMuscular grupoMuscular;

}
