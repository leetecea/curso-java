package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do { // Do -> pelo menos uma vez esse código será executado, depois dependerá do while
			System.out.println("Você precisa falar "
					+ "\nas palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));

		
		System.out.println("Obrigado!");

		entrada.close();
		
		// + usados:
		// 1 - For
		// 2 - While
		// 3 - Do/While
	}
}
