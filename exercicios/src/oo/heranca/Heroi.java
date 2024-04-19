package oo.heranca;

// Herança será definida a partir da palavra reservada extends
//Heroi vai herdar do Jogador
// Heroi vai receber o atributos e comportamentos por herança do Jogador
public class Heroi extends Jogador {
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;

	}
	
}
