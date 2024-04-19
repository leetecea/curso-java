package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	// instanciando erros genericos
	// não basta criar o erro, é preciso lança-los pelo throw (lançar)
	
	// Exceção NÃO checada ou NÃO verifica
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!"); 
		// exceções do tipo Runtime não obrigado a tratar o erro
	}

	// Exceção checada ou verificada
	static void geraErro2() throws Exception { // precisa deixar claro na assinatura que tem uma exceção checada
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
