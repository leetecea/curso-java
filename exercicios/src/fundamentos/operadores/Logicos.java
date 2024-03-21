package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
				
		
		System.out.println("\n Tabela verdade E - AND");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true); // a partir da primeira expressão já sabe que retornara um false
//		System.out.println(false && false); // a partir da primeira expressão já sabe que retornara um false
		
		System.out.println("\n Tabela verdade OU - OR");
//		System.out.println(true || true); // a partir da primeira expressão já sabe que retornara um true
//		System.out.println(true || false); // a partir da primeira expressão já sabe que retornara um true
		System.out.println(false || true); 
		System.out.println(false || false);
		
		System.out.println("\n Tabela verdade OU EXCLUSIVO - XOR ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\n Tabela verdade NEGAÇÃO - NOT"); // Operador unário
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!false); // dupla negação - retorna o mesmo valor
	}
}
