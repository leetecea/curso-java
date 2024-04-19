package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
//		new Utilitarios();
// não pode ser instanciado, pois seu construtor é privado 		
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!! ";
				
		System.out.println("\n\nUsando composição...");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(primeiraLetra)
			.map(Utilitarios::grito)
			.forEach(print);
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 34891fdfb7f42ee02e3dcb48adda6a6c0b28674b
