package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
	
		Supplier<List<String>> umLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		// é obrigado a utilizar (), pois não está passando nenhum parâmetro
		System.out.println(umLista.get());
		// get() retorna o que o supplier vai devolver, ou seja, uma lista (array)
	}

}