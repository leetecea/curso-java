package oo.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		
		Ana esposa = new Ana();

		// System.out.println(esposa.segredo); 
		// private - somente a classe Ana conhece o segredo dela
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}
}
