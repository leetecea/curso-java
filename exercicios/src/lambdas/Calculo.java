package lambdas;

@FunctionalInterface
// notaçãp para informar que usará a interface no contexto de lambda
// força utilizar um único método
public interface Calculo {
// 	def de um método dentro de uma interface obrigatoriamente tem que ser public
	// e é por padrão abstract
	double executar(double a, double b);
	
	default double legal(double a, double b) {
		return executar(a,b);
	}
	
	static String muitoLegal() { // a partir de um metodo static não consegue acessar o this (instancia atual)
		return "muito legal"; // por isso não tem acesso ao método executar
	}
}
