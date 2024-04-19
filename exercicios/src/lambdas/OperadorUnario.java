package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois // 0 -> 0 + 2 = 2
				.andThen(vezesDois) // 2 -> 2 * 2 = 4
				.andThen(aoQuadrado) // 4 -> 4 * 4 = 16
				.apply(0); // passando 0
		System.out.println(resultado1); // print 16
		
// utilizando compose() a leitura será ao contrário 
		int resultado2 = aoQuadrado // 4 * 4
				.compose(vezesDois) // 2 * 2
				.compose(maisDois) //  + 2
				.apply(0); // passando 0
		System.out.println(resultado2); 
	}
}
