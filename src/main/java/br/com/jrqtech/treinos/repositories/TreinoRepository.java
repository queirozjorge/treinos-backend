package br.com.jrqtech.treinos.repositories;

import br.com.jrqtech.treinos.models.Entities.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {
}
