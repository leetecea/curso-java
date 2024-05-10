package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable // serve para pegar os dados que estao nesta classe para serem compartilhados por varias tabelas
public class Endereco {

	private String logradouro;
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}