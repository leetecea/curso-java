package modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes") // setando nome da tabela
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Double nota;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable( // personalizando a tabela intermediaria
		name = "atores_filmes",
		joinColumns = @JoinColumn(name="filme_id", referencedColumnName = "id"), //referente a classe que estou definindo isso
		inverseJoinColumns = @JoinColumn(name="ator_id", referencedColumnName = "id") // que vem da outra entidade
	)
	private List<Ator> atores;

	public Filme() {

	}

	public Filme(String nome, Double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
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

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		if(atores == null) { // para evitar retornar nulo
			atores = new ArrayList<>();
		}
		return atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	public void adicionarAtor(Ator ator) {
		if(ator != null && !getAtores().contains(ator)) { // se ator não for nulo e ator não esta na lista de atores
			getAtores().add(ator); // adiciona ator na lista de atores
			
			if(!ator.getFilmes().contains(this)) { // se a lista de filmes desse ator não contem esse filme
				ator.getFilmes().add(this);	// add esse filme na lista desse ator
			}
		}
	}
}