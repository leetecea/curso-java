package oo.composicao.umPraUm;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		
		// falta o Encapsulamento: 
		// c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		// Relação bidirecional - as vezes é necessário pela coerência
		// por padrão normalmente se utiliza mais a relação unidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}
}
