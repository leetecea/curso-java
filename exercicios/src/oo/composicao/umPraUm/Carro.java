package oo.composicao.umPraUm;

public class Carro {
	final Motor motor;
	
// Criação de um novo objeto Carro que será vinculado a instancia Motor
// Estabelece uma relação no momemento da criação do objeto Carro
// será possivel fazer coisar como isso em CarroTeste:
// c1.motor.carro.motor.carro.motor.giros(); -> Existe relação bidirecional
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao > 2.5 ) {		
			motor.fatorInjecao +=0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5 ) {
			motor.fatorInjecao -=0.4;			
		}
	}
	
	void ligar(){
		motor.ligado = true;
	}
	
	void desligar(){
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
