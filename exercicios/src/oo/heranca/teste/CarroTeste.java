package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(300);
		
		ferrari.ligarTurbo();
		
		ferrari.acelerar();
		System.out.println(ferrari); 
		ferrari.frear();
		System.out.println(ferrari);
		
		System.out.println(ferrari.velocidadeDoAr());
		
		Carro fusca = new Fusca();
		fusca.acelerar();
		System.out.println(fusca);
		fusca.frear();
		fusca.frear();
		System.out.println(fusca);
	
	}
}
