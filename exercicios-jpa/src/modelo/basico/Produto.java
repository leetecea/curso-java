package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "curso_java")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // valor unico para cada produto
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false) //bom utilizar para documentar
	private String nome;

	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2) // 11 digitos, 2 casas decimais 0.00
	private Double preco;

	public Produto() { // construtor padrão é importante para o JPA conseguir gerar os objetos

	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}