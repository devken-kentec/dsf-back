package br.com.kentec.dsf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.kentec.dsf.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	@Query("SELECT c FROM Categoria c WHERE c.status = 'Ativo' ")
	Iterable<Categoria> mostrarCategoriaAtiva();
}
