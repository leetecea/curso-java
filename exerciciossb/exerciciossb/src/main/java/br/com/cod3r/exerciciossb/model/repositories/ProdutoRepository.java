package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
// Repositório define a interface de como irá abstrair o acesso aos dados
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

//Convenções para busca que não precisam de implementação
	
//	findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//	
//	findByNomeStartsWith
//	findByNomeEndsWith
//	
//	findByNomeNotContaining

	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

}
