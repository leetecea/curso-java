package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
//		Function<Integer, String> stringBinaria = 
//				num -> Integer.toBinaryString(num);
		
		UnaryOperator<String> inverter = 
				stringInvertida -> new StringBuilder(stringInvertida).reverse().toString();
		
		Function<String, Integer> binarioParaInteiro = 
				inteiro -> Integer.parseInt(inteiro, 2); 
// passando 2 como segundo paramentro, ele entende que voce quer converter uma string binaria em um inteiro
		
		nums.stream() // op. construção
			.map(Integer::toBinaryString) // sequencia de op. intermediarias
			.map(inverter)
			.map(binarioParaInteiro)
			.forEach(System.out::println); // op. terminal
	}
}