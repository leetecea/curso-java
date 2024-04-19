package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {

		// System.out.println(esposa.segredo); 
		// private - somente a classe Ana conhece o segredo dela
		
		// pacote - não é visível por herança se estiver em outro pacote
//		System.out.println(mae.facoDentroDeCasa); 
		
// Precisa acessar via herança e não criando uma instancia do tipo Ana
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
		
		
	}

}
