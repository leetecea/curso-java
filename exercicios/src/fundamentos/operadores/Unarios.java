package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);// true 2 == 2 // Precedência:  ++a como o ++ vem antes do operando 
										// significa que tem menos pressa que o b--, onde o -- vem depois
										// decrementa o valor de b depois de fazer a comparação com a
		System.out.println(a == b); // false 2 == 1
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
