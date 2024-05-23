package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.Entities.Exercicio;
import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import br.com.jrqtech.treinos.repositories.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class BulkPersistController {

    @Autowired
    private ExercicioRepository exercicioRepository;

    @GetMapping("/insere-exercicios")
    public void insereExercicios() {
            List<Exercicio> exercicios = Arrays.asList(
                    Exercicio.builder().descricao("Supino reto").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Supino inclinado").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Supino declinado").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Supino com halteres").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Crucifixo com halteres").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Crucifixo na máquina (Peck Deck)").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Flexões de braço").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Dip para peito").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Crossover na polia").grupoMuscular(GrupoMuscular.PEITO).build(),
                    Exercicio.builder().descricao("Levantamento terra").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Remada curvada com barra").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Remada unilateral com halter").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Puxada alta (lat pulldown)").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Remada baixa").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Barra fixa (Pull-up)").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Chin-up").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Remada T-bar").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Pullover").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Encolhimento de ombros").grupoMuscular(GrupoMuscular.COSTAS).build(),
                    Exercicio.builder().descricao("Desenvolvimento militar").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Desenvolvimento com halteres").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Desenvolvimento na máquina").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação lateral com halteres").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação frontal com halteres").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação lateral na polia").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Arnold press").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação posterior com halteres").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Remada alta com barra").grupoMuscular(GrupoMuscular.OMBRO).build(),
                    Exercicio.builder().descricao("Agachamento livre").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Agachamento frontal").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Leg press").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Extensão de pernas").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Flexão de pernas").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Agachamento hack").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Levantamento terra romeno").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Passada (lunge)").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Afundo").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Agachamento búlgaro").grupoMuscular(GrupoMuscular.PERNAS).build(),
                    Exercicio.builder().descricao("Levantamento terra sumô").grupoMuscular(GrupoMuscular.GLUTEOS).build(),
                    Exercicio.builder().descricao("Ponte de glúteo (hip thrust)").grupoMuscular(GrupoMuscular.GLUTEOS).build(),
                    Exercicio.builder().descricao("Agachamento sumô").grupoMuscular(GrupoMuscular.GLUTEOS).build(),
                    Exercicio.builder().descricao("Cadeira abdutora").grupoMuscular(GrupoMuscular.GLUTEOS).build(),
                    Exercicio.builder().descricao("Cadeira adutora").grupoMuscular(GrupoMuscular.GLUTEOS).build(),
                    Exercicio.builder().descricao("Step-up com halteres").grupoMuscular(GrupoMuscular.GLUTEOS).build(),
                    Exercicio.builder().descricao("Elevação de panturrilhas em pé").grupoMuscular(GrupoMuscular.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Elevação de panturrilhas sentado").grupoMuscular(GrupoMuscular.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Panturrilhas no leg press").grupoMuscular(GrupoMuscular.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Panturrilhas no Smith").grupoMuscular(GrupoMuscular.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Rosca direta").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca alternada").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca concentrada").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca martelo").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca Scott").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca inversa").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca no cabo").grupoMuscular(GrupoMuscular.BICEPS).build(),
                    Exercicio.builder().descricao("Supino fechado").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps francês").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps pulley").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Dip para tríceps").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps coice (kickback)").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Extensão de tríceps com halteres acima da cabeça").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps na máquina").grupoMuscular(GrupoMuscular.TRICEPS).build(),
                    Exercicio.builder().descricao("Crunch").grupoMuscular(GrupoMuscular.ABDOMEN).build(),
                    Exercicio.builder().descricao("Elevação de pernas na barra fixa").grupoMuscular(GrupoMuscular.ABDOMEN).build(),
                    Exercicio.builder().descricao("Ab wheel rollout").grupoMuscular(GrupoMuscular.ABDOMEN).build(),
                    Exercicio.builder().descricao("Prancha").grupoMuscular(GrupoMuscular.ABDOMEN).build(),
                    Exercicio.builder().descricao("Crunch na polia").grupoMuscular(GrupoMuscular.ABDOMEN).build(),
                    Exercicio.builder().descricao("Abdominal na máquina").grupoMuscular(GrupoMuscular.ABDOMEN).build()
            );
            exercicioRepository.saveAll(exercicios);
    }

}
