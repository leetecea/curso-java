package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	void testeAcessos() {
		
		Ana sogra = new Ana();

		// System.out.println(esposa.segredo); 
		// private - somente a classe Ana conhece o segredo dela
		
//		System.out.println(sogra.facoDentroDeCasa);
// 		pacote - não é visível por herança se estiver em outro pacote
		
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
		
	}
}
