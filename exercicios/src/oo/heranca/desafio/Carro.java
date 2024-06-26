package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
// se voce perde o construtor padrão, isso gera impacto em todas as suas heranças
// será necessário ajustar isso de forma explicita, irá precisar invocar construtor a partir do super passando os parametros
	// nao temos mais o construtor padrão dentro da classe
	// e sim um construtor explicito:
	protected Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();			
		}
	}
	
	public void frear() {
		if( velocidadeAtual >= 5) {
			velocidadeAtual -= 5;			
		} else {
			velocidadeAtual = 0;
		}	
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h";
	}


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
