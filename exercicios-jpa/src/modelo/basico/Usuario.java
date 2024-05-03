package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // responsavél por inserir/alterar/excluir/consultar uma entidade
public class Usuario { // nome da tabelo no banco de dados será exatamente igual ao nome da classe (sem letras maiusculas)
	// classe Usuario é uma entidade
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // SEQUENCE - pode compartilhar uma mesma sequencia com mais de uma entidade
	// IDENTITY - usuario terá sua propria sequencia, produto também terá sua própria sequencia
	// AUTO - usa a sequence
	private Long id;
	private String nome;
	private String email;
	
//	@Transient // o atributo não será mapeado para o BD.ex: atributo calculado
//	private Double precoComDesconto;
	
	public Usuario() {
		
	}
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
