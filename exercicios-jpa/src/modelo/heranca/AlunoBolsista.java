package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity // não da problema por nao ter id, pois o herda de Aluno que possui um id
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {
	
	// vai herdar o id (matricula) e nome da entidade/classe Aluno 

	private double valorBolsa;

	public AlunoBolsista() {

	}

	public AlunoBolsista(Long matricula, String nome, double valorBolsa) {
		super(matricula, nome); // inicializo o construtor da classe super chamando matricula e nome
		this.valorBolsa = valorBolsa;
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
}