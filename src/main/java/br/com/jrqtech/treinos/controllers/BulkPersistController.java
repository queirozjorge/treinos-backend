package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.models.Entities.Exercicio;
import br.com.jrqtech.treinos.models.enums.GrupoMuscularEnum;
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
                    Exercicio.builder().descricao("Supino reto").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Supino inclinado").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Supino declinado").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Supino com halteres").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Crucifixo com halteres").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Crucifixo na máquina (Peck Deck)").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Flexões de braço").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Dip para peito").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Crossover na polia").grupoMuscular(GrupoMuscularEnum.PEITO).build(),
                    Exercicio.builder().descricao("Levantamento terra").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Remada curvada com barra").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Remada unilateral com halter").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Puxada alta (lat pulldown)").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Remada baixa").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Barra fixa (Pull-up)").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Chin-up").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Remada T-bar").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Pullover").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Encolhimento de ombros").grupoMuscular(GrupoMuscularEnum.COSTAS).build(),
                    Exercicio.builder().descricao("Desenvolvimento militar").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Desenvolvimento com halteres").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Desenvolvimento na máquina").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação lateral com halteres").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação frontal com halteres").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação lateral na polia").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Arnold press").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Elevação posterior com halteres").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Remada alta com barra").grupoMuscular(GrupoMuscularEnum.OMBRO).build(),
                    Exercicio.builder().descricao("Agachamento livre").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Agachamento frontal").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Leg press").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Extensão de pernas").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Flexão de pernas").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Agachamento hack").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Levantamento terra romeno").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Passada (lunge)").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Afundo").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Agachamento búlgaro").grupoMuscular(GrupoMuscularEnum.PERNAS).build(),
                    Exercicio.builder().descricao("Levantamento terra sumô").grupoMuscular(GrupoMuscularEnum.GLUTEOS).build(),
                    Exercicio.builder().descricao("Ponte de glúteo (hip thrust)").grupoMuscular(GrupoMuscularEnum.GLUTEOS).build(),
                    Exercicio.builder().descricao("Agachamento sumô").grupoMuscular(GrupoMuscularEnum.GLUTEOS).build(),
                    Exercicio.builder().descricao("Cadeira abdutora").grupoMuscular(GrupoMuscularEnum.GLUTEOS).build(),
                    Exercicio.builder().descricao("Cadeira adutora").grupoMuscular(GrupoMuscularEnum.GLUTEOS).build(),
                    Exercicio.builder().descricao("Step-up com halteres").grupoMuscular(GrupoMuscularEnum.GLUTEOS).build(),
                    Exercicio.builder().descricao("Elevação de panturrilhas em pé").grupoMuscular(GrupoMuscularEnum.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Elevação de panturrilhas sentado").grupoMuscular(GrupoMuscularEnum.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Panturrilhas no leg press").grupoMuscular(GrupoMuscularEnum.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Panturrilhas no Smith").grupoMuscular(GrupoMuscularEnum.PANTURRILHAS).build(),
                    Exercicio.builder().descricao("Rosca direta").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca alternada").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca concentrada").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca martelo").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca Scott").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca inversa").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Rosca no cabo").grupoMuscular(GrupoMuscularEnum.BICEPS).build(),
                    Exercicio.builder().descricao("Supino fechado").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps francês").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps pulley").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Dip para tríceps").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps coice (kickback)").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Extensão de tríceps com halteres acima da cabeça").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Tríceps na máquina").grupoMuscular(GrupoMuscularEnum.TRICEPS).build(),
                    Exercicio.builder().descricao("Crunch").grupoMuscular(GrupoMuscularEnum.ABDOMEN).build(),
                    Exercicio.builder().descricao("Elevação de pernas na barra fixa").grupoMuscular(GrupoMuscularEnum.ABDOMEN).build(),
                    Exercicio.builder().descricao("Ab wheel rollout").grupoMuscular(GrupoMuscularEnum.ABDOMEN).build(),
                    Exercicio.builder().descricao("Prancha").grupoMuscular(GrupoMuscularEnum.ABDOMEN).build(),
                    Exercicio.builder().descricao("Crunch na polia").grupoMuscular(GrupoMuscularEnum.ABDOMEN).build(),
                    Exercicio.builder().descricao("Abdominal na máquina").grupoMuscular(GrupoMuscularEnum.ABDOMEN).build()
            );
            exercicioRepository.saveAll(exercicios);
    }

}
