package lambdas;

import java.util.function.BinaryOperator;

// BinaryOperator -> recebe dois parametros do mesmo tipo e saída com o mesmo tipo

public class CalculoTeste3 {
	
	public static void main(String[] args) {

// Java NÃO permite int -> Double: transformar int primitivo para Double do tipo classe
// consegue fazer isso: double -> Double, mas não o caso acima
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		
		System.out.println(calc.apply(2., 5.0));
		
		calc = (x,y) -> x * y; 
		System.out.println(calc.apply(2.0, 3.0));
		
	}
}
