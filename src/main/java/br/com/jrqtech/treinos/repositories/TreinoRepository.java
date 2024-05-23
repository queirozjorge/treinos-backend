package br.com.jrqtech.treinos.repositories;

import br.com.jrqtech.treinos.models.Entities.Treino;
import br.com.jrqtech.treinos.models.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {

    List<Treino> findByUsuario(Usuario usuario);

}
