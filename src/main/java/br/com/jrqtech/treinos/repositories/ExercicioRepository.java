package br.com.jrqtech.treinos.repositories;

import br.com.jrqtech.treinos.models.Entities.Exercicio;
import br.com.jrqtech.treinos.models.enums.GrupoMuscular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {

    public List<Exercicio> findByGrupoMuscular(GrupoMuscular grupoMuscular);

}
