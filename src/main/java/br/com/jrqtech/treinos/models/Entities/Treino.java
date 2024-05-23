package br.com.jrqtech.treinos.models.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

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
    private LocalDate diaSemana;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Exercicio> exercicios;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

}
