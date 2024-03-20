package fundamentos.operadores;

public class Aritimeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);// operação com double retorna double
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b); // operação com int retorna int
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // converte resultado p/ double
		System.out.println(a / (float) b); // converte resultado p/ float
		
		System.out.println(a % b); // operador modulo
		System.out.println(8 % 3); // retorna o resto da divisao entre dois operandos
		
		System.out.println(x + y - a * b);
	}
}
