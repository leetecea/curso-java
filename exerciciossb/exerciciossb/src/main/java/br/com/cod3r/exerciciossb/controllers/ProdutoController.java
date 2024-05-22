package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired // coloca automaticamente um objeto dentro do atributo produtoRepo
	private ProdutoRepository produtoRepo; // injeção de dependencia

	// função responsável por inserir/alterar produto
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarPorduto(@Valid Produto produto) { 
		produtoRepo.save(produto); //persiste o produto no mysql
		return produto;
	}
	
//	@PostMapping
//	public @ResponseBody Produto novoPorduto(
//			@RequestParam String nome,
//			@RequestParam double preco,
//			@RequestParam double desconto) {
//		Produto produto= new Produto(nome, preco, desconto);
//		produtoRepo.save(produto); 
//		return produto;
//	}
	
	// Pegando todos os produtos - não é recomendado, em um sistema real esse método não existiria
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepo.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
//		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepo.searchByNameLike(parteNome);
	}
	
	@GetMapping("/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina, @PathVariable int qtdPagina) {
		Pageable page = PageRequest.of(numeroPagina, qtdPagina);
		return produtoRepo.findAll(page);
	}
	
	// Pegando produto por ID
	@GetMapping("/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) { // Optional, pois será possível passar um id que não existe
		return produtoRepo.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepo.save(produto);
//		return produto;
//	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable int id) { // Optional, pois será possível passar um id que não existe
		produtoRepo.deleteById(id);
	}
}
