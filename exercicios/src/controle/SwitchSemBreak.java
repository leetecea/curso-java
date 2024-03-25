package controle;

public class SwitchSemBreak {
	// forma menos usual
	// quase SEMPRE se usa com a palavra BREAK
	public static void main(String[] args) {
		// if(bool) ...
		// while(bool) ...
		// for (;bool;) ...
		
		String faixa = "preta";
		
		// Quando você nao tem o BREAK, ele entra no case que bate com o valor da FAIXA e sai executando todos de baixo
		// Switch - recebe uma expressão que é o próprio valor e não TRUE/FALSE
	
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println();
		}switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim!");	
		
		int idade = 2;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	}
}
