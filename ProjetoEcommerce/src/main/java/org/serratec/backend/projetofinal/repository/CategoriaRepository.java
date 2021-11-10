package org.serratec.backend.projetofinal.repository;

import java.util.Optional;

import org.serratec.backend.projetofinal.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	Optional<Categoria> findByNome(String nome);

}
