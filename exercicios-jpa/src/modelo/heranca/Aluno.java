package modelo.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // JOINED cria duas tabelas 
// Se comentar a linha acima, será gerada uma single table, que é a estrategia padrão.
// SINGLE_TABLE: única tabeça no BD terá todas as propriedades das classes da hierarquia.
// Irá criar somente a tabela aluno que terá matricula, nome e valorBolsa
// Para mapear uma SINGLE_TABLE: 
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING) // nome da coluna, tamanho e tipo do valor
@DiscriminatorValue("AL")

// quando nao se mapeia uma herança, ele cria tudo numa tabela, mas nao cria um discriminador
public class Aluno {

	@Id
	private Long matricula;

	private String nome;

	public Aluno() {

	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}